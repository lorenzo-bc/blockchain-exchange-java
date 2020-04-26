package com.blockchain.exchange.reference.types;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "l2",
 *   "symbol": "BTC-USD"
 * }
 */
public class MarketDataL2Request extends Request {
    private Action action;
    private Channel channel;
    private String symbol;

    public MarketDataL2Request(String symbol) {
        this.action = Action.subscribe;
        this.channel = Channel.l2;
        this.symbol = symbol;
    }
}
