package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

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
