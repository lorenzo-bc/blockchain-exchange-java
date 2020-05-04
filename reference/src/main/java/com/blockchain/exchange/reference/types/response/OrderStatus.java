package com.blockchain.exchange.reference.types.response;

/**
 * https://exchange.blockchain.com/api/#state
 * pending	Order is pending acceptance. Only applicable to stop and stop-limit orders
 * open	Order has been accepted
 * rejected	Order has been rejected	Limit and market orders can get rejected if you have no balance to fill the order even partially.
 * cancelled	Order has been cancelled	A market order might get in state cancelled if you don’t have enough balance to fill it at market price. Both market orders and limit orders with IOC can have ordStatus ‘cancelled’ if there is no market for them, even without the user requesting the cancellation.
 * filled	Order has been filled	A limit order get in state cancelled after the user requested a cancellation.
 * partial	Order has been partially filled
 * expired	Order has been expired
 */
public enum OrderStatus {
    pending,
    open,
    rejected,
    cancelled,
    filled,
    partial,
    expired;
}
