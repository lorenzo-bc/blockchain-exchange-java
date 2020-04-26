package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.MarketDataL2Request;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.BalanceSnapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Snapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Update;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

/**
 * https://exchange.blockchain.com/api/?code#l2-order-book
 */
public class MarketDataL2 extends WebsocketClientEndpoint {

    public MarketDataL2(URI endpointURI) {
        super(endpointURI);
    }

    public void start() {
        connect();
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        Request request = new MarketDataL2Request("BTC-USD");
        System.out.printf("request %s\n", request);
        sendMessage(request);
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        MarketDataL2Snapshot marketDataSnapshot = Utils.gson().fromJson(message, MarketDataL2Snapshot.class);
        onMarketDataSnapShot(marketDataSnapshot);
    }

    public void onMarketDataSnapShot(MarketDataL2Snapshot marketDataSnapshot) {
        Double bestAsk = null;
        if (marketDataSnapshot.asks.size() > 0) {
            bestAsk = marketDataSnapshot.asks.get(marketDataSnapshot.asks.size() -1).px;
        }
        Double bestBid = null;
        if (marketDataSnapshot.bids.size() > 0) {
            bestBid = marketDataSnapshot.bids.get(0).px;
        }
        System.out.printf("%s price is %f - %f\n",marketDataSnapshot.symbol, bestBid, bestAsk);
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);

        MarketDataL2Update marketDataUpdate = Utils.gson().fromJson(message, MarketDataL2Update.class);
        onMarketDataUpdate(marketDataUpdate);
    }

    public void onMarketDataUpdate(MarketDataL2Update marketDataUpdate) {
    }
}
