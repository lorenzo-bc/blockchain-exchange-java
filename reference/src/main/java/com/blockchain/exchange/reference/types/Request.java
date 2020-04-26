package com.blockchain.exchange.reference.types;

import com.blockchain.exchange.utils.Utils;

public abstract class Request {
    public String toString() {
        return Utils.gson().toJson(this);
    }
}
