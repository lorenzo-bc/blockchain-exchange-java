package com.blockchain.exchange.reference.types.response;

/**
 * https://exchange.blockchain.com/api/#type
 * limit	order which has a price limit
 * market	order that will match at any price available in the market, starting from the best prices and filling up to the available balance
 * stop	order which has a stop/trigger price, and when that price is reached, it triggers a market order
 * stopLimit	order which has a stop price and limit price, and when the stop price is reached, it triggers a limit order at the limit price
 */
public enum OrderType {
    limit,
    market,
    stop,
    stopLimit;
}
