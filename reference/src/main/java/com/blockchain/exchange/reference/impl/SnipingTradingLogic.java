package com.blockchain.exchange.reference.impl;

import com.blockchain.exchange.reference.base.MarketDataL2Callback;
import com.blockchain.exchange.reference.base.MarketDataL2Module;
import com.blockchain.exchange.reference.base.TradingCallback;
import com.blockchain.exchange.reference.base.TradingModule;
import com.blockchain.exchange.reference.types.response.*;
import com.blockchain.reference.market.MarketDepthL2;
import com.blockchain.reference.market.TopOfTheBookL2;

import java.util.UUID;

/**
 * Sniper algo
 *
 * If the top of the book price get 10% better in one single market update, we take that price.
 */
public class SnipingTradingLogic implements TradingCallback, MarketDataL2Callback {
    private TradingModule tradingHandler;
    private MarketDataL2Module marketDataL2Module;

    private String symbol = "BTC-USD";
    private MarketDepthL2 orderbook = new MarketDepthL2();
    private MarketDataL2Level currentBid;
    private MarketDataL2Level previousBid;
    private MarketDataL2Level currentAsk;
    private MarketDataL2Level previousAsk;

    // Sell if the price move 10% up, or buy if it moves 10% down
    private double priceThreshold = 0.1;
    private double maxOrdersize = 0.01;

    public SnipingTradingLogic(
            TradingModule tradingHandler,
            MarketDataL2Module marketDataL2Module
            ) {
        this.tradingHandler = tradingHandler;
        this.marketDataL2Module = marketDataL2Module;
    }

    public void start() {
        tradingHandler.start();
        marketDataL2Module.start();
    }

    public void onTradingSubscribed() {

    }

    public void onAuthenticated() {

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
        System.out.printf("Order %s partially filled at price %f", orderUpdate.clOrdID, orderUpdate.avgPx);
    }

    private void onOrderFilled(OrderUpdate orderUpdate) {
        System.out.printf("Order %s filled at price %f", orderUpdate.clOrdID, orderUpdate.avgPx);
    }

    private void onOrderPending(OrderUpdate orderUpdate) {

    }

    @Override
    public void onL2Connected() {
        marketDataL2Module.subscribe(symbol);
    }

    @Override
    public void onL2Disconnected() {
        orderbook.invalidate();
    }

    @Override
    public void onSnapshot(MarketDataL2Snapshot l2Snapshot) {
        orderbook.update(l2Snapshot);
        TopOfTheBookL2 tob = orderbook.getTopOfTheBook();
        previousAsk = tob.ask;
        previousBid = tob.bid;
        currentAsk = null;
        currentBid = null;
    }

    @Override
    public void onUpdate(MarketDataL2Update l2Update) {
        orderbook.update(l2Update);
        TopOfTheBookL2 tob = orderbook.getTopOfTheBook();
        currentAsk = tob.ask;
        currentBid = tob.bid;

        checkIfOrderShouldBePlaced();

        previousAsk = currentAsk;
        previousBid = currentBid;
        currentAsk = null;
        currentBid = null;
    }

    private void checkIfOrderShouldBePlaced() {
        if (currentBid == null || currentAsk == null || previousBid == null || previousAsk == null) {
            return;
        }
        if (currentBid == previousBid && currentAsk == previousAsk) {
            return;
        }

        System.out.printf("TOB is %s\n",orderbook.getTopOfTheBook());

        /*
         * If the ask get 10% lower in one single tick we buy at that price with a market order
         */
        if (currentAsk.px < (1.0-priceThreshold) * previousAsk.px) {
            String clOrderId = UUID.randomUUID().toString().substring(0, 20);
            double quantity = Math.min(maxOrdersize, currentAsk.px);
            System.out.printf("PLACING ORDER %s: %s %f@%f\n",clOrderId, Side.buy.name(), quantity, currentAsk.px);
            tradingHandler.placeMarketOrder(clOrderId, symbol, Side.buy, quantity);
        } else {
            double move = currentAsk.px / previousAsk.px;
            System.out.printf("Bid move was only %f\n", move);
        }

        /*
         * If the bid get 10% higher in one single tick we sell at that price with a market order
         */
        if (currentBid.px > (1.0+priceThreshold) * previousBid.px) {
            String clOrderId = UUID.randomUUID().toString().substring(0, 20);
            double quantity = Math.min(maxOrdersize, currentBid.px);
            System.out.printf("PLACING ORDER %s: %s %f@%f\n",clOrderId, Side.sell.name(), quantity, currentBid.px);
            tradingHandler.placeMarketOrder(clOrderId, symbol, Side.sell, quantity);
        } else {
            double move = currentAsk.px / previousAsk.px;
            System.out.printf("Ask move was only %f\n", move);
        }
    }
}
