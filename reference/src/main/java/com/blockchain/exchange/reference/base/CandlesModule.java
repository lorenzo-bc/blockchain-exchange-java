package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.MarketDataL3Request;
import com.blockchain.exchange.reference.types.request.PricesRequest;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.MarketDataL3Snapshot;
import com.blockchain.exchange.reference.types.response.PricesUpdate;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

/**
 * https://exchange.blockchain.com/api/#prices
 */
public class CandlesModule extends WebsocketClientEndpoint {

    private Integer granularity = 60;

    public CandlesModule(URI endpointURI) {
        super(endpointURI);
    }

    public void start(Integer granularity) {
        this.granularity = granularity;
        connect();
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        Request request = new PricesRequest("BTC-USD", granularity);
        sendMessage(request);
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);
        PricesUpdate candle = Utils.gson().fromJson(message, PricesUpdate.class);
        onMarketDataUpdate(candle);
    }

    /**
     * We receive on update whenever the current candle has to be updated.
     * @param candle
     */
    public void onMarketDataUpdate(PricesUpdate candle) {
        System.out.printf("%s\n", candle.getData());
    }
}
