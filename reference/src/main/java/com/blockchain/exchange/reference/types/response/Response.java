package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;
import com.blockchain.exchange.utils.Utils;

public class Response {
    public Long seqnum;
    public Event event;
    public Channel channel;
    public String text;

    /**
     *
     * @param seqnum
     * @param event
     * @param channel
     * @param text in case of error it contains the error description
     */
    public Response(
            Long seqnum,
            Event event,
            Channel channel,
            String text
    ) {
        this.seqnum = seqnum;
        this.event = event;
        this.channel = channel;
        this.text = text;
    }

    public String toString() {
        return Utils.gson().toJson(this);
    }
}
