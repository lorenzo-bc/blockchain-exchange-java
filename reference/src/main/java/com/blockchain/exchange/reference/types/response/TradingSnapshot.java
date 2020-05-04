package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

import java.util.List;

/**
 * {
 *    "seqnum":2,
 *    "event":"snapshot",
 *    "channel":"trading",
 *    "orders":[
 *       {
 *          "orderID":"172539120929",
 *          "clOrdID":"84d36e6983734c34webd",
 *          "symbol":"ETH-GBP",
 *          "side":"buy",
 *          "ordType":"limit",
 *          "orderQty":0.2,
 *          "leavesQty":0.2,
 *          "cumQty":0.0,
 *          "avgPx":0.0,
 *          "ordStatus":"open",
 *          "timeInForce":"GTC",
 *          "text":"New order",
 *          "execType":"0",
 *          "execID":"1478282326",
 *          "transactTime":"2020-05-03T19:23:29.381709Z",
 *          "msgType":8,
 *          "lastPx":0.0,
 *          "lastShares":0.0,
 *          "tradeId":"0",
 *          "fee":0.0,
 *          "price":12.0
 *       }
 *    ]
 * }
 */
public class TradingSnapshot extends Response {
    public List<OrderSnapshot> orders;

    public TradingSnapshot(
            Long seqnum,
            Event event,
            Channel channel,
            List<OrderSnapshot> orders
    ) {
        super(seqnum, event, channel, null);
        this.orders = orders;
    }
}
