package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.MarketDataL2Request;
import com.blockchain.exchange.reference.types.Request;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

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
}
