package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.reference.types.Action;
import com.blockchain.exchange.reference.types.Channel;

/**
 * {
 *   "action": "subscribe",
 *   "channel": "symbols"
 * }
 */
public class SymbolsRequest extends Request {
    private Action action;
    private Channel channel;

    public SymbolsRequest() {
        this.action = Action.subscribe;
        this.channel = Channel.symbols;
    }
}
