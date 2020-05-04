package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.response.OrderType;
import com.blockchain.exchange.reference.types.response.Side;
import com.blockchain.exchange.reference.types.response.Tif;

/**
 * {
 *   "action": "NewOrderSingle",
 *   "channel": "trading",
 *   "clOrdID": "Client ID 3",
 *   "symbol": "BTC-USD",
 *   "ordType": "limit",
 *   "timeInForce": "GTC",
 *   "side": "sell",
 *   "orderQty": 10.0,
 *   "price": 3400.0,
 *   "execInst": "ALO"
 *   "expireDate":"YYYYMMDD"
 * }
 */
public class CreateLimitOrderRequest extends Request {
    public Action action;
    public Channel channel;
    // max 20 chars
    public String clOrdID;
    public String symbol;
    public OrderType ordType;
    public Tif timeInForce;
    public Side side;
    public Double orderQty;
    public Double price;
    // null or "ALO", only for limit orders
    public String execInst;
    // Only for GTD
    public String expireDate;

    public CreateLimitOrderRequest(String clOrdID, String symbol, Tif timeInForce, Side side, Double quantity, Double price, Boolean postOnly, String expireDate) {
        this.action = Action.NewOrderSingle;
        this.channel = Channel.trading;
        this.clOrdID = clOrdID;
        this.symbol = symbol;
        this.ordType = OrderType.limit;
        this.timeInForce = timeInForce;
        this.side = side;
        this.orderQty = quantity;
        this.price = price;
        if (postOnly) {
            this.execInst = "ALO";
        } else {
            this.execInst = null;
        }
        this.expireDate = expireDate;
    }
}
