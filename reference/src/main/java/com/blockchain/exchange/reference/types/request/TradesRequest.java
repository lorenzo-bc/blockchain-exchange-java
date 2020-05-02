package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "ticker",
 *   "symbol": "BTC-USD"
 * }
 */
public class TradesRequest extends Request {
    private Action action;
    private Channel channel;
    private String symbol;

    public TradesRequest(String symbol) {
        this.action = Action.subscribe;
        this.channel = Channel.trades;
        this.symbol = symbol;
    }
}
