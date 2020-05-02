package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

/**
 * {
 *   "seqnum": 8,
 *   "event": "snapshot",
 *   "channel": "ticker",
 *   "symbol": "BTC-USD",
 *   "price_24h": 4988.0,
 *   "volume_24h": 0.3015,
 *   "last_trade_price": 5000.0
 * }
 */
public class TickerSnapshot extends Response {
    public Double price_24h;
    public Double volume_24h;
    public Double last_trade_price;

    public TickerSnapshot(
            Long seqnum,
            Event event,
            Channel channel,
            Double price_24h,
            Double volume_24h,
            Double last_trade_price
    ) {
        super(seqnum, event, channel, null);
        this.price_24h = price_24h;
        this.volume_24h = volume_24h;
        this.last_trade_price = last_trade_price;
    }
}

