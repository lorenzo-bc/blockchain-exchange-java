package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "BulkCancelOrderRequest",
 *   "channel":"trading:,
 *   "symbol": "BTC-USD"
 * }
 */
public class BulkCancelOrderRequest extends Request {
    public Action action;
    public Channel channel;
    public String symbol;

    /**
     *
     * @param symbol if null cancel all of them
     */
    public BulkCancelOrderRequest(String symbol) {
        this.action = Action.BulkCancelOrderRequest;
        this.channel = Channel.trading;
        this.symbol = symbol;
    }
}
