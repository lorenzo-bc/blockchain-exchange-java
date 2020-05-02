package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "prices",
 *   "symbol": "BTC-USD",
 *   "granularity": 60
 * }
 */
public class PricesRequest extends Request {
    private Action action;
    private Channel channel;
    private String symbol;
    private Integer granularity;

    /**
     * @param granularity in seconds, only valid values are are 60, 300, 900, 3600, 21600, 86400
     */
    public PricesRequest(String symbol, Integer granularity) {
        this.action = Action.subscribe;
        this.channel = Channel.prices;
        this.symbol = symbol;
        this.granularity = granularity;
    }
}
