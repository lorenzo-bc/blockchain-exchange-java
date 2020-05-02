package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.request.TradesRequest;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.reference.types.response.TradesUpdate;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;
import java.util.Arrays;

/**
 * https://exchange.blockchain.com/api/#trades
 */
public class TradesModule extends WebsocketClientEndpoint {

    private Iterable<String> symbols = Arrays.asList("DGLD-USD", "ETH-BTC");

    public TradesModule(URI endpointURI) {
        super(endpointURI);
    }

    public void start(Iterable<String> symbols) {
        this.symbols = symbols;
        connect();
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        for (String symbol : symbols) {
            Request request = new TradesRequest(symbol);
            sendMessage(request);
        }
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);
        TradesUpdate tradesUpdate = Utils.gson().fromJson(message, TradesUpdate.class);
        onTradesUpdate(tradesUpdate);
    }

    public void onTradesUpdate(TradesUpdate tradesUpdate) {
    }
}
