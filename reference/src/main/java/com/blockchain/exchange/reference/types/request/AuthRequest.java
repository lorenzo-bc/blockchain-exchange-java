package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.request.Request;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "auth",
 *   "token": "SECRET_TOKEN"
 * }
 */
public class AuthRequest extends Request {
    private Action action;
    private Channel channel;
    private String token;

    public AuthRequest(String token) {
        this.action = Action.subscribe;
        this.channel = Channel.auth;
        this.token = token;
    }
}
