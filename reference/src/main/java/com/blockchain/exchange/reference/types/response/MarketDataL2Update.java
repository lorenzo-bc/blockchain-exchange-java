package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

import java.util.List;

/**
 * {
 *    "seqnum":2,
 *    "event":"updated",
 *    "channel":"l2",
 *    "symbol":"BTC-USD",
 *    "bids":[
 *       {
 *          "num":0,
 *          "px":7618.7,
 *          "qty":0.0
 *       }
 *    ],
 *    "asks":[
 *
 *    ]
 * }
 *
 * MarketDataL2Update and MarketDataL2Snapshot have the same fields
 */
public class MarketDataL2Update extends MarketDataL2Snapshot {
    /**
     * @param seqnum
     * @param event
     * @param channel
     * @param symbol
     * @param bids    ordered by increasing px
     * @param asks    ordered by increasing px
     */
    public MarketDataL2Update(Long seqnum, Event event, Channel channel, String symbol, List<MarketDataL2Level> bids, List<MarketDataL2Level> asks) {
        super(seqnum, event, channel, symbol, bids, asks);
    }
}