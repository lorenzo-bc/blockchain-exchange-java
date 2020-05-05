package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.response.MarketDataL2Snapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Update;

public interface MarketDataL2Callback {
    void onL2Connected();

    void onL2Disconnected();

    void onSnapshot(MarketDataL2Snapshot l2Snapshot);

    void onUpdate(MarketDataL2Update l2Update);
}
