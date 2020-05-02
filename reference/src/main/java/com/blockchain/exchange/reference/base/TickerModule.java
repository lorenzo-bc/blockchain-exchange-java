package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.TickerRequest;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.*;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://exchange.blockchain.com/api/?code#l2-order-book
 */
public class TickerModule extends WebsocketClientEndpoint {

    private Iterable<String> symbols = Arrays.asList("DGLD-USD", "ETH-BTC");

    public TickerModule(URI endpointURI) {
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
            Request request = new TickerRequest(symbol);
            sendMessage(request);
        }
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        TickerSnapshot tickerSnapshot = Utils.gson().fromJson(message, TickerSnapshot.class);
        onTickerSnapShot(tickerSnapshot);
    }

    public void onTickerSnapShot(TickerSnapshot tickerSnapshot) {
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);
        TickerUpdate tickerUpdate = Utils.gson().fromJson(message, TickerUpdate.class);
        ontickerUpdate(tickerUpdate);
    }

    public void ontickerUpdate(TickerUpdate tickerUpdate) {
    }
}
