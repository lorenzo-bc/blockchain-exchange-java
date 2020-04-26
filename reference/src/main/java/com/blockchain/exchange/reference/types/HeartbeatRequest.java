package com.blockchain.exchange.reference.types;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "heartbeat"
 * }
 */
public class HeartbeatRequest extends Request {
    private Action action;
    private Channel channel;

    public HeartbeatRequest() {
        this.action = Action.subscribe;
        this.channel = Channel.heartbeat;
    }
}
