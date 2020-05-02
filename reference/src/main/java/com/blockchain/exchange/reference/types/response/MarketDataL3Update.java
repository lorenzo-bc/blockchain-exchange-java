package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

import java.util.List;

/**
 * {
 *    "seqnum":2,
 *    "event":"updated",
 *    "channel":"l3",
 *    "symbol":"BTC-USD",
 *    "bids":[
 *       {
 *          "id":"13621582604",
 *          "px":8974.6,
 *          "qty":0.0
 *       }
 *    ],
 *    "asks":[
 *    ]
 * }
 *
 * MarketDataL3Update and MarketDataL3Snapshot have the same fields
 */
public class MarketDataL3Update extends MarketDataL3Snapshot {
    /**
     * @param seqnum
     * @param event
     * @param channel
     * @param symbol
     * @param bids    ordered by increasing px
     * @param asks    ordered by increasing px
     */
    public MarketDataL3Update(Long seqnum, Event event, Channel channel, String symbol, List<MarketDataL3Level> bids, List<MarketDataL3Level> asks) {
        super(seqnum, event, channel, symbol, bids, asks);
    }
}