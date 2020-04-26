package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "balances"
 * }
 */
public class BalanceRequest extends Request {
    private Action action;
    private Channel channel;

    public BalanceRequest() {
        this.action = Action.subscribe;
        this.channel = Channel.balances;
    }
}
