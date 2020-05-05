package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.response.OrderRejectedResponse;
import com.blockchain.exchange.reference.types.response.OrderUpdate;
import com.blockchain.exchange.reference.types.response.TradingSnapshot;

public interface TradingCallback {

    void onTradingSubscribed();

    void onAuthenticated();

    void onSnapshot(TradingSnapshot tradingSnapshot);

    void onRejected(OrderRejectedResponse orderRejected);

    void onAnyOrderUpdate(OrderUpdate orderUpdate);
}
