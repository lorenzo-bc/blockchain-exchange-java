package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.*;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;

public class AuthenticatedWebsocketClient extends WebsocketClientEndpoint {
    private final String token;

    public AuthenticatedWebsocketClient(URI endpointURI, String token) {
        super(endpointURI);
        this.token = token;
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        Request request = new AuthRequest(token);
        System.out.printf("request %s\n", request);
        sendMessage(request);
    }

    @Override
    public void onMessage(String message) {
        super.onMessage(message);
//        JsonElement e = Utils.gson().fromJson(message, JsonElement.class);
    }

    @Override
    public void onSubscribed(JsonObject message, Response response) {
        super.onSubscribed(message, response);
        if (response.channel == Channel.auth) {
            onAuthenticated();
        }
    }

    /**
     * Called when we authenticated
     */
    public void onAuthenticated() {
    }
}
