package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.response.SymbolStatus;

/**
 *  {
 *     "base_currency":"ETH",
 *     "base_currency_scale":8,
 *     "counter_currency":"TRY",
 *     "counter_currency_scale":2,
 *     "min_price_increment":10,
 *     "min_price_increment_scale":2,
 *     "min_order_size":2200000,
 *     "min_order_size_scale":8,
 *     "max_order_size":0,
 *     "max_order_size_scale":8,
 *     "lot_size":1,
 *     "lot_size_scale":8,
 *     "status":"open",
 *     "id":38,
 *     "auction_price":0.0,
 *     "auction_sizeauction_size":0.0,
 *     "auction_time":"",
 *     "imbalance":0.0
 *  },
 *
 * auction-price	If the symbol is halted and will open on an auction, this will be the opening price.
 * auction-size	Opening size
 * auction-time	Opening time in HHMM format.
 * imbalance	Auction imbalance. If > 0 then there will be buy orders left over at the auction price. If < 0 then there will be sell orders left over at the auction price.
 * status	Symbol status; open, close, suspend, halt, halt-freeze.
 * base_currency	The currency quantities are expressed in
 * base_currency_scale	The number of decimals the currency can be split in
 * counter_currency	The currency prices are expressed in
 * counter_currency_scale	The number of decimals the currency can be split in
 * min_price_increment	The price of the instrument must be a multiple of min_price_increment * (10^-min_price_increment_scale)
 * min_price_increment_scale	The price of the instrument must be a multiple of min_price_increment * (10^-min_price_increment_scale)
 * min_order_size	The minimum quantity for an order for this instrument must be min_order_size*(10^-min_order_size_scale)
 * min_order_size_scale	The minimum quantity for an order for this instrument must be min_order_size*(10^-min_order_size_scale)
 * max_order_size	The maximum quantity for an order for this instrument is max_order_size*(10^-max_order_size_scale). If this equal to zero, there is no limit
 * max_order_size_scale	The maximum quantity for an order for this instrument is max_order_size*(10^-max_order_size_scale). If this equal to zero, there is no limit
 */
public class SymbolSpecification {
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
}
