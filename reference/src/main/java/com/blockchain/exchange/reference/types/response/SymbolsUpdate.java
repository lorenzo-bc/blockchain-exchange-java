package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

/**
 * {
 *    "seqnum":38,
 *    "event":"updated",
 *    "channel":"symbols",
 *    "symbol":"ALGO-USD",
 *    "base_currency":"ALGO",
 *    "base_currency_scale":6,
 *    "counter_currency":"USD",
 *    "counter_currency_scale":2,
 *    "min_price_increment":1,
 *    "min_price_increment_scale":4,
 *    "min_order_size":20000000,
 *    "min_order_size_scale":6,
 *    "max_order_size":0,
 *    "max_order_size_scale":6,
 *    "lot_size":1,
 *    "lot_size_scale":6,
 *    "status":"open",
 *    "id":31,
 *    "auction_price":0.0,
 *    "auction_size":0.0,
 *    "auction_time":"",
 *    "imbalance":0.0
 * }
 */
public class SymbolsUpdate extends Response {
    public String symbol;
    public String base_currency;
    public Integer base_currency_scale;
    public String counter_currency;
    public Integer counter_currency_scale;
    public Integer min_price_increment;
    public Integer min_price_increment_scale;
    public Long min_order_size;
    public Integer min_order_size_scale;
    public Long max_order_size;
    public Integer max_order_size_scale;
    public Integer lot_size;
    public Integer lot_size_scale;
    public SymbolStatus status;
    public Integer id;
    public Double auction_price;
    public Double auction_size;
    public String auction_time;
    public Double imbalance;

    public SymbolsUpdate(Long seqnum, Event event, Channel channel, String text) {
        super(seqnum, event, channel, text);
    }
}

