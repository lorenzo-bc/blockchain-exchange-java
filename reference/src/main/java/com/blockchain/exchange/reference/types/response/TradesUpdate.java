package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

/**
 * {
 *    "seqnum":4,
 *    "event":"updated",
 *    "channel":"trades",
 *    "symbol":"XLM-USD",
 *    "timestamp":"2020-05-02T20:44:57.423115Z",
 *    "side":"buy",
 *    "qty":8626.4464014,
 *    "price":0.0758,
 *    "trade_id":"60130929000"
 * }
 */
public class TradesUpdate extends Response {
    public String symbol;
    public String timestamp;
    public Side side;
    public Double qty;
    public Double price;
    public String trade_id;

    public TradesUpdate(Long seqnum, Event event, Channel channel, String text, Side side, Double qty, Double price, String trade_id) {
        super(seqnum, event, channel, text);
        this.side = side;
        this.qty = qty;
        this.price = price;
        this.trade_id = trade_id;
    }
}

