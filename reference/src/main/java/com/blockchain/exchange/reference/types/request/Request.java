package com.blockchain.exchange.reference.types.request;

import com.blockchain.exchange.utils.Utils;

public abstract class Request {
    public String toString() {
        return Utils.gson().toJson(this);
    }
}
