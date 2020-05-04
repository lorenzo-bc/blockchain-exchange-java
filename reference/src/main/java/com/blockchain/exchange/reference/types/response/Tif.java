package com.blockchain.exchange.reference.types.response;

/**
 * https://exchange.blockchain.com/api/#timeinforce
 * GTC	Good Till Cancel. The order will rest on the order book until it is cancelled or filled
 * GTD	Good Till Date. The order will reset on the order book until it is cancelled, filled, or expired
 * FOK	Fill or Kill. The order is either completely filled or cancelled. No Partial Fills are permitted.
 * IOC	Immediate or Cancel. The order is either a) completely filled, b) partially filled and the remaining quantity canceled, or c) the order is canceled.
 */
public enum Tif {
    GTC,
    GTD,
    FOK,
    IOC;
}
