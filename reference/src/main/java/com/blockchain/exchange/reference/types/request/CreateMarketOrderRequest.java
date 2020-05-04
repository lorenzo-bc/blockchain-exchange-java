package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.response.OrderType;
import com.blockchain.exchange.reference.types.response.Side;

/**
 * {
 *   "action": "NewOrderSingle",
 *   "channel": "trading",
 *   "clOrdID": "Client ID 3",
 *   "symbol": "BTC-USD",
 *   "ordType": "market",
 *   "side": "sell",
 *   "orderQty": 10.0
 * }
 */
public class CreateMarketOrderRequest extends Request {
    public Action action;
    public Channel channel;
    // max 20 chars
    public String clOrdID;
    public String symbol;
    public OrderType ordType;
    public Side side;
    public Double orderQty;

    public CreateMarketOrderRequest(String clOrdID, String symbol, Side side, Double quantity) {
        this.action = Action.NewOrderSingle;
        this.channel = Channel.trading;
        this.clOrdID = clOrdID;
        this.symbol = symbol;
        this.ordType = OrderType.market;
        this.side = side;
        this.orderQty = quantity;
    }
}
