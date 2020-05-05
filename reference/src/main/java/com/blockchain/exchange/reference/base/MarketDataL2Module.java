package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.MarketDataL2Request;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.BalanceSnapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Snapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Update;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

/**
 * https://exchange.blockchain.com/api/?code#l2-order-book
 */
public class MarketDataL2Module extends WebsocketClientEndpoint {

    private MarketDataL2Callback callback;

    public MarketDataL2Module(URI endpointURI) {
        super(endpointURI);
    }

    public void start() {
        connect();
    }

    public void addCallback(MarketDataL2Callback callback) {
        this.callback = callback;
    }

    public void subscribe(String symbol) {
        Request request = new MarketDataL2Request(symbol);
        System.out.printf("request %s\n", request);
        sendMessage(request);
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        if (callback != null) {
            callback.onL2Connected();
        }
    }

    @Override
    public void onClose(Session userSession, CloseReason reason) {
        super.onClose(userSession, reason);
        if (callback != null) {
            callback.onL2Disconnected();
        }
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        MarketDataL2Snapshot marketDataSnapshot = Utils.gson().fromJson(message, MarketDataL2Snapshot.class);
        if (callback != null) {
            callback.onSnapshot(marketDataSnapshot);
        }
        onMarketDataSnapShot(marketDataSnapshot);
    }

    public void onMarketDataSnapShot(MarketDataL2Snapshot marketDataSnapshot) {
        Double bestAsk = null;
        if (marketDataSnapshot.asks.size() > 0) {
            bestAsk = marketDataSnapshot.asks.get(0).px;
        }
        Double bestBid = null;
        if (marketDataSnapshot.bids.size() > 0) {
            bestBid = marketDataSnapshot.bids.get(marketDataSnapshot.bids.size() -1).px;
        }
        System.out.printf("%s best price is %f - %f\n",marketDataSnapshot.symbol, bestBid, bestAsk);
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);

        MarketDataL2Update marketDataUpdate = Utils.gson().fromJson(message, MarketDataL2Update.class);
        if (callback != null) {
            callback.onUpdate(marketDataUpdate);
        }
    }
}
