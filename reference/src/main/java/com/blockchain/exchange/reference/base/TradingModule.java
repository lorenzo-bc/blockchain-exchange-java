package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.request.*;
import com.blockchain.exchange.reference.types.response.*;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import java.net.URI;

/**
 * https://exchange.blockchain.com/api/#Tradings
 */
public class TradingModule extends AuthenticatedWebsocketClient {
    public Boolean isSubscribed = false;
    private TradingCallback callbacks;

    public TradingModule(URI endpointURI, String token) {
        super(endpointURI, token);
    }

    public void addCallback(TradingCallback callbacks) {
        this.callbacks = callbacks;
    }

    public void start() {
        connect();
    }

    @Override
    public void onAuthenticated() {
        super.onAuthenticated();
        Request request = new TradingRequest();
        sendMessage(request);
        callbacks.onAuthenticated();
    }

    @Override
    public void onSubscribed(JsonObject message, Response response) {
        super.onSubscribed(message, response);
        if (response.channel == Channel.trading) {
            isSubscribed = true;
            callbacks.onSubscribed();
        }
    }

    @Override
    public void onRejected(JsonObject message, Response response) {
        OrderRejectedResponse orderRejected = Utils.gson().fromJson(message, OrderRejectedResponse.class);
        callbacks.onRejected(orderRejected);
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        TradingSnapshot tradingSnapshot = Utils.gson().fromJson(message, TradingSnapshot.class);
        callbacks.onSnapshot(tradingSnapshot);
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);
        OrderUpdate orderUpdate = Utils.gson().fromJson(message, OrderUpdate.class);
        callbacks.onAnyOrderUpdate(orderUpdate);
    }

    /**
     *https://exchange.blockchain.com/api/#trading
     *
     * @param clOrdID
     * @param symbol
     * @param timeInForce
     * @param side
     * @param quantity
     * @param price
     * @param postOnly The order is placed with Add Liquidity Only (aka Post Only): it will not match liquidity immediately. It will be rejected instead of matching liquidity in the market.
     * @param expireDate expiry date in the format YYYYMMDD, required for GTD orders
     */
    public void placeLimitOrder(
            String clOrdID,
            String symbol,
            Tif timeInForce,
            Side side,
            Double quantity,
            Double price,
            Boolean postOnly,
            String expireDate
    ) throws IllegalArgumentException {
        if (clOrdID.length() > 20) {
            throw new IllegalArgumentException("clOrdID can have only 20 chars");
        }
        if (timeInForce == Tif.GTD) {
            if (expireDate == null || expireDate.length() != 8) {
                throw new IllegalArgumentException("Expected expireDate for GTD");
            }
        }

        CreateLimitOrderRequest request = new CreateLimitOrderRequest(
                clOrdID = clOrdID,
                symbol = symbol,
                timeInForce = timeInForce,
                side = side,
                quantity = quantity,
                price = price,
                postOnly = postOnly,
                expireDate = expireDate
        );
        sendMessage(request);
    }

    public void placeMarketOrder(
            String clOrdID,
            String symbol,
            Side side,
            Double quantity
    ) throws IllegalArgumentException {
        if (clOrdID.length() > 20) {
            throw new IllegalArgumentException("clOrdID can have only 20 chars");
        }

        CreateMarketOrderRequest request = new CreateMarketOrderRequest(
                clOrdID = clOrdID,
                symbol = symbol,
                side = side,
                quantity = quantity
        );
        sendMessage(request);
    }

    /**
     *
     * @param symbol null to cancelAll
     */
    public void cancelAllOrders(
            String symbol
    ) {
        BulkCancelOrderRequest request = new BulkCancelOrderRequest(symbol = symbol);
        sendMessage(request);
    }
}
