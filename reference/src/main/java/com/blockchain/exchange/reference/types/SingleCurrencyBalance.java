package com.blockchain.exchange.reference.types;

/**
 *  {
 *     "currency":"BTC",
 *     "balance":0.04000000,
 *     "available":0.04000000,
 *     "balance_local":302.9092,
 *     "available_local":302.9092,
 *     "rate":7572.73
 *  }
 */
public class SingleCurrencyBalance {

    public String currency;
    public Double balance;
    public Double available;
    public Double balance_local;
    public Double available_local;
    public Double rate;

    /**
     *
     * @param currency
     * @param balance total in token
     * @param available tradeable amount in token
     * @param balance_local total in local currency
     * @param available_local tradeable amount in local currency
     * @param rate from currency to local currency
     */
    public SingleCurrencyBalance(
            String currency,
            Double balance,
            Double available,
            Double balance_local,
            Double available_local,
            Double rate
    ) {
        this.currency = currency;
        this.balance = balance;
        this.available = available;
        this.balance_local = balance_local;
        this.available_local = available_local;
        this.rate = rate;
    }
}
