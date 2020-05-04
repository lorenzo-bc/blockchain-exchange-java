package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

/**
 * {
 *    "seqnum":3,
 *    "event":"updated",
 *    "channel":"trading",
 *    "orderID":"-1",
 *    "clOrdID":"8a611c86-e9e6-4f57-b",
 *    "symbol":"BTC-USD",
 *    "side":"buy",
 *    "ordType":"limit",
 *    "orderQty":1.0E-4,
 *    "leavesQty":1.0E-4,
 *    "cumQty":0.0,
 *    "avgPx":0.0,
 *    "ordStatus":"rejected",
 *    "timeInForce":"GTC",
 *    "text":"Insufficient Balance",
 *    "execType":"8",
 *    "execID":"0",
 *    "transactTime":"2020-05-04T19:23:31.495583Z",
 *    "msgType":8,
 *    "lastPx":0.0,
 *    "lastShares":0.0,
 *    "tradeId":"0",
 *    "fee":0.0,
 *    "price":120.0
 * }
 */
public class OrderUpdate extends Response {
    public String orderID;
    public String clOrdID;
    public String symbol;
    public Side side;
    public OrderType ordType;
    public Double orderQty;
    public Double leavesQty;
    public Double cumQty;
    public Double avgPx;
    public OrderStatus ordStatus;
    public Tif timeInForce;
    public String execType;
    public String execID;
    public String transactTime;
    public String msgType;
    public String lastPx;
    public String lastShares;
    public String tradeId;
    public Double fee;
    public Double price;

    /**
     * @param seqnum
     * @param event
     * @param channel
     * @param text    in case of error it contains the error description
     */
    public OrderUpdate(Long seqnum, Event event, Channel channel, String text) {
        super(seqnum, event, channel, text);
    }
}
