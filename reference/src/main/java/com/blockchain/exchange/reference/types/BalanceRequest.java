package com.blockchain.exchange.reference.types;

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
