package com.blockchain.exchange.reference.types;

import java.util.List;

/**
 * {
 *    "seqnum":7,
 *    "event":"snapshot",
 *    "channel":"balances",
 *    "balances":[
 *       {
 *          "currency":"ETH",
 *          "balance":0.11145027,
 *          "available":0.11145027,
 *          "balance_local":21.73280265,
 *          "available_local":21.73280265,
 *          "rate":195.0
 *       },
 *       {
 *          "currency":"GBP",
 *          "balance":569.56,
 *          "available":569.56,
 *          "balance_local":703.015840262,
 *          "available_local":703.015840262,
 *          "rate":1.2343139272
 *       },
 *       {
 *          "currency":"DGLD",
 *          "balance":0.03736681,
 *          "available":0.03736681,
 *          "balance_local":6.373283114,
 *          "available_local":6.373283114,
 *          "rate":170.56
 *       },
 *       {
 *          "currency":"EUR",
 *          "balance":1.17,
 *          "available":1.17,
 *          "balance_local":1.2636,
 *          "available_local":1.2636,
 *          "rate":1.08
 *       },
 *       {
 *          "currency":"TRY",
 *          "balance":139.39,
 *          "available":139.39,
 *          "balance_local":19.974948578,
 *          "available_local":19.974948578,
 *          "rate":0.143302594
 *       },
 *       {
 *          "currency":"USD",
 *          "balance":0.00,
 *          "available":0.00,
 *          "balance_local":0.0,
 *          "available_local":0.0,
 *          "rate":1.0
 *       },
 *       {
 *          "currency":"BCH",
 *          "balance":0.00015150,
 *          "available":0.00015150,
 *          "balance_local":0.036443325,
 *          "available_local":0.036443325,
 *          "rate":240.55
 *       },
 *       {
 *          "currency":"BTC",
 *          "balance":0.04000000,
 *          "available":0.04000000,
 *          "balance_local":302.9092,
 *          "available_local":302.9092,
 *          "rate":7572.73
 *       }
 *    ],
 *    "total_available_local":1055.306117929,
 *    "total_balance_local":1055.306117929
 * }
 */
public class BalanceSnapshot extends Response {
    public List<SingleCurrencyBalance> balances;
    public Double total_available_local;
    public Double total_balance_local;

    public BalanceSnapshot(
            Long seqnum,
            Event event,
            Channel channel,
            Action action,
            List<SingleCurrencyBalance> balances,
            Double total_available_local,
            Double total_balance_local
    ) {
        super(seqnum, event, channel);
        this.balances = balances;
        this.total_available_local = total_available_local;
        this.total_balance_local = total_balance_local;
    }
}

