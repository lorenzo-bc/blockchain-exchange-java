package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.spi.LocaleNameProvider;

/**
 * {
 *   "seqnum": 2,
 *   "event": "updated",
 *   "channel": "prices",
 *   "symbol": "BTC-USD",
 *   "price": [1559039640, 8697.24, 8700.98, 8697.27, 8700.98, 0.431]
 * }
 */
public class PricesUpdate extends Response {
    public JsonArray price;

    /**
     *
     * @param price array of [timestamp, open, high, low, close, volume]
     */
    public PricesUpdate(Long seqnum, Event event, Channel channel, String text, JsonArray price) {
        super(seqnum, event, channel, text);
        this.price = price;
    }

    public CandleData getData() {
        return new CandleData(
                price.get(0).getAsLong(),
                price.get(1).getAsDouble(),
                price.get(2).getAsDouble(),
                price.get(3).getAsDouble(),
                price.get(4).getAsDouble(),
                price.get(5).getAsDouble()
        );
    }
}