package com.blockchain.exchange.reference.types.response;

/**
 * 0 = New
 * 1 = Partial fill (Replaced)
 * 2 = Fill (Replaced)
 * 3 = Done for day
 * 4 = Canceled
 * 6 = Pending Cancel (e.g. result of Order Cancel Request <F>)
 * 8 = Rejected
 * C = Expired
 */
public enum ExecType {
    New,
    PartialFill,
    Fill,
    Canceled,
    Rejected;
}
