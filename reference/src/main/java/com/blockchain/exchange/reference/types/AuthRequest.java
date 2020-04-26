package com.blockchain.exchange.reference.types;

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
