package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *    "action": "subscribe",
 *    "channel": "ticker",
 *    "symbol": "ETH-USD"
 * }
 */
public class TickerRequest extends Request {
    private Action action;
    private Channel channel;
    private String symbol;

    public TickerRequest(String symbol) {
        this.action = Action.subscribe;
        this.channel = Channel.ticker;
        this.symbol = symbol;
    }
}
