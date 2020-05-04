package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "trading"
 * }
 */
public class TradingRequest extends Request {
    private Action action;
    private Channel channel;

    public TradingRequest() {
        this.action = Action.subscribe;
        this.channel = Channel.trading;
    }
}
