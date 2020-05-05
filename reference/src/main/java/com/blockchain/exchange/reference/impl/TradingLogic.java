package com.blockchain.exchange.reference.impl;

import com.blockchain.exchange.reference.base.MarketDataL2Callback;
import com.blockchain.exchange.reference.base.TradingCallback;
import com.blockchain.exchange.reference.base.TradingModule;
import com.blockchain.exchange.reference.types.response.*;

import java.util.UUID;

public class TradingLogic implements TradingCallback, MarketDataL2Callback {
    private TradingModule tradingHandler;

    public TradingLogic(TradingModule tradingHandler) {
        this.tradingHandler = tradingHandler;
    }

    public void onTradingSubscribed() {

    }

    public void onAuthenticated() {
        String clOrderId1 = UUID.randomUUID().toString().substring(0, 20);
        tradingHandler.placeLimitOrder(
                clOrderId1,
                "BTC-USD",
                Tif.GTC,
                Side.sell,
                0.0001,
                120.0,
                true,
                null
        );
        System.out.printf("Placing limit order %s", clOrderId1);
        tradingHandler.cancelAllOrders(null);

        // now place a market order
        String clOrderId2 = UUID.randomUUID().toString().substring(0, 20);

        System.out.printf("Placing market order %s", clOrderId2);
        tradingHandler.placeMarketOrder(clOrderId2, "BTC-USD", Side.buy, 0.001);
    }

    @Override
    public void onSnapshot(TradingSnapshot tradingSnapshot) {
        System.out.printf(
                "There are %d open orders\n",
                tradingSnapshot.orders.size()
        );
    }

    @Override
    public void onRejected(OrderRejectedResponse orderRejected) {
        System.out.printf("Rejected because %s\n", orderRejected.text);
    }

    @Override
    public void onAnyOrderUpdate(OrderUpdate orderUpdate) {
        switch (orderUpdate.ordStatus) {
            case rejected:
                onOrderReject(orderUpdate);
                break;
            case open:
                onOrderAccepted(orderUpdate);
                break;
            case cancelled:
                onOrderCancelled(orderUpdate);
                break;
            case expired:
                onOrderExpired(orderUpdate);
                break;
            case partial:
                onOrderPartiallyFilled(orderUpdate);
                break;
            case filled:
                onOrderFilled(orderUpdate);
                break;
            case pending:
                onOrderPending(orderUpdate);
                break;
        }
    }

    private void onOrderReject(OrderUpdate orderUpdate) {
        System.out.printf("Rejected because %s\n", orderUpdate.text);

    }

    private void onOrderAccepted(OrderUpdate orderUpdate) {

    }

    private void onOrderCancelled(OrderUpdate orderUpdate) {

    }

    private void onOrderExpired(OrderUpdate orderUpdate) {

    }

    private void onOrderPartiallyFilled(OrderUpdate orderUpdate) {

    }

    private void onOrderFilled(OrderUpdate orderUpdate) {
        System.out.printf("Order %s filled at price %f", orderUpdate.clOrdID, orderUpdate.avgPx);
    }

    private void onOrderPending(OrderUpdate orderUpdate) {

    }

    @Override
    public void onL2Connected() {

    }

    @Override
    public void onL2Disconnected() {

    }

    @Override
    public void onSnapshot(MarketDataL2Snapshot l2Snapshot) {
        // Pass
    }

    @Override
    public void onUpdate(MarketDataL2Update l2Update) {
        // pass
    }
}
