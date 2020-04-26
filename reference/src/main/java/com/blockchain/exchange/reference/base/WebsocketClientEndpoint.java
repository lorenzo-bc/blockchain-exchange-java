package com.blockchain.exchange.reference.base;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.websocket.*;

/**
 * ChatServer Client
 *
 * @author Jiji_Sasidharan
 */
@ClientEndpoint
public class WebsocketClientEndpoint extends Endpoint implements MessageHandler.Whole<String> {

    protected Session userSession = null;
    private URI endpointURI;
    public boolean connected = false;

    public WebsocketClientEndpoint(URI endpointURI)  {
        this.endpointURI = endpointURI;
    }

    public void connect() {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            ClientEndpointConfig.Builder configBuilder = ClientEndpointConfig.Builder.create();
            configBuilder.configurator(new ClientEndpointConfig.Configurator() {
                @Override
                public void beforeRequest(Map<String, List<String>> headers) {
                    headers.put("origin", Collections.singletonList("https://exchange.blockchain.com"));
                }
            });
            ClientEndpointConfig config = configBuilder.build();
            container.connectToServer(this, config, endpointURI);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Callback hook for Connection open events.
     *
     * @param session the userSession which is opened.
     */
    @Override
    public void onOpen(Session session, EndpointConfig config) {
        System.out.printf("opening websocket %s\n", session);
        this.userSession = session;
        this.userSession.addMessageHandler(this);
        connected = true;
    }

    /**
     * Callback hook for Connection close events.
     *
     * @param userSession the userSession which is getting closed.
     * @param reason the reason for connection close
     */
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket");
        connected = false;
        this.userSession = null;
    }

    @OnError
    public void onError(Session session, Throwable t) {
        System.out.println("Error");
        t.printStackTrace();
        connected = false;
        this.userSession = null;
    }

    /**
     * Callback hook for Message Events. This method will be invoked when a client send a message.
     *
     * @param message The text message
     */
    @Override
    public void onMessage(String message) {
//        System.out.printf("Got2 %s\n", message);
        System.out.println(message);
        JsonObject e = Utils.gson().fromJson(message, JsonObject.class);
        Response response = Utils.gson().fromJson(e, Response.class);
//        System.out.printf("deserialized response %s\n", response);
        switch (response.event) {
            case subscribed: onSubscribed(e, response);
                break;
            case unsubscribed: onUnsubscribed(e, response);
                break;
            case rejected: onRejected(e, response);
                break;
            case snapshot: onSnapshot(e, response);
                break;
            case updated: onUpdate(e, response);
                break;
        }
    }

    public void onSubscribed(JsonObject message, Response response) {

    }

    public void onUnsubscribed(JsonObject message, Response response) {

    }

    public void onRejected(JsonObject message, Response response) {

    }

    public void onSnapshot(JsonObject message, Response response) {

    }

    public void onUpdate(JsonObject message, Response response) {

    }


    /**
     * Send a message.
     *
     * @param message
     */
    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);
    }

    public void sendMessage(Request message) {
        System.out.printf("request %s\n", message);
        this.userSession.getAsyncRemote().sendText(Utils.gson().toJson(message));
    }
}