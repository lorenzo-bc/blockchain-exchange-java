package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "l3",
 *   "symbol": "BTC-USD"
 * }
 */
public class MarketDataL3Request extends Request {
    private Action action;
    private Channel channel;
    private String symbol;

    public MarketDataL3Request(String symbol) {
        this.action = Action.subscribe;
        this.channel = Channel.l3;
        this.symbol = symbol;
    }
}
