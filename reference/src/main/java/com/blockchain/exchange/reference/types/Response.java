package com.blockchain.exchange.reference.types;

import com.blockchain.exchange.utils.Utils;

public class Response {
    public Long seqnum;
    public Event event;
    public Channel channel;

    public Response(
            Long seqnum,
            Event event,
            Channel channel
    ) {
        this.seqnum = seqnum;
        this.event = event;
        this.channel = channel;
    }

    public String toString() {
        return Utils.gson().toJson(this);
    }
}
