package com.blockchain.exchange.reference.types.response;

/**
 *  {
 *     "orderID":"172539120929",
 *     "clOrdID":"84d36e6983734c34webd",
 *     "symbol":"ETH-GBP",
 *     "side":"buy",
 *     "ordType":"limit",
 *     "orderQty":0.2,
 *     "leavesQty":0.2,
 *     "cumQty":0.0,
 *     "avgPx":0.0,
 *     "ordStatus":"open",
 *     "timeInForce":"GTC",
 *     "text":"New order",
 *     "execType":"0",
 *     "execID":"1478282326",
 *     "transactTime":"2020-05-03T19:23:29.381709Z",
 *     "msgType":8,
 *     "lastPx":0.0,
 *     "lastShares":0.0,
 *     "tradeId":"0",
 *     "fee":0.0,
 *     "price":12.0
 *  }
 */
public class OrderSnapshot {
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
    public String text;
    public String execType;
    public String execID;
    public String transactTime;
    public String msgType;
    public String lastPx;
    public String lastShares;
    public String tradeId;
    public Double fee;
    public Double price;
}
