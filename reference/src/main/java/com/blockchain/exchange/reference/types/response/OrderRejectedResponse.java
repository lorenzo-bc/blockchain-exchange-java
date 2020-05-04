package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

/**
 * {
 *    "seqnum":4,
 *    "event":"rejected",
 *    "channel":"trading",
 *    "text":"Unknown symbol",
 *    "clOrdID":"21d42182-8c20-4174-a",
 *    "ordStatus":"rejected",
 *    "action":"NewOrderSingle"
 * }
 */
public class OrderRejectedResponse extends Response {
    public String clOrdID;
    public String symbol;
    public OrderStatus ordStatus;

    /**
     * @param seqnum
     * @param event
     * @param channel
     * @param text    in case of error it contains the error description
     */
    public OrderRejectedResponse(Long seqnum, Event event, Channel channel, String text) {
        super(seqnum, event, channel, text);
    }
}
