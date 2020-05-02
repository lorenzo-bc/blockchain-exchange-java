package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.MarketDataL3Request;
import com.blockchain.exchange.reference.types.request.MarketDataL3Request;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.MarketDataL3Snapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL3Update;
import com.blockchain.exchange.reference.types.response.MarketDataL3Snapshot;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

/**
 * https://exchange.blockchain.com/api/?code#L3-order-book
 */
public class MarketDataL3Module extends WebsocketClientEndpoint {
    private String symbol = "BTC-USD";

    public MarketDataL3Module(URI endpointURI) {
        super(endpointURI);
    }

    public void start(String symbol)
    {
        this.symbol = symbol;
        connect();
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        Request request = new MarketDataL3Request(symbol);
//        System.out.printf("request1 %s\n", request);
        sendMessage(request);
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        MarketDataL3Snapshot marketDataSnapshot = Utils.gson().fromJson(message, MarketDataL3Snapshot.class);
        onMarketDataSnapShot(marketDataSnapshot);
    }

    public void onMarketDataSnapShot(MarketDataL3Snapshot marketDataSnapshot) {
        Double bestAsk = null;
        if (marketDataSnapshot.asks.size() > 0) {
            bestAsk = marketDataSnapshot.asks.get(0).px;
        }
        Double bestBid = null;
        if (marketDataSnapshot.bids.size() > 0) {
            bestBid = marketDataSnapshot.bids.get(0).px;
        }
        System.out.printf("%s best price is %f - %f\n",marketDataSnapshot.symbol, bestBid, bestAsk);
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);

        MarketDataL3Update marketDataUpdate = Utils.gson().fromJson(message, MarketDataL3Update.class);
        onMarketDataUpdate(marketDataUpdate);
    }

    public void onMarketDataUpdate(MarketDataL3Update marketDataUpdate) {
    }
}
