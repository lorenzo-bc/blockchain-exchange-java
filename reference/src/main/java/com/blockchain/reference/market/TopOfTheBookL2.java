package com.blockchain.reference.market;

import com.blockchain.exchange.reference.types.response.MarketDataL2Level;

public class TopOfTheBookL2 {
    public MarketDataL2Level bid;
    public MarketDataL2Level ask;

    public TopOfTheBookL2(MarketDataL2Level bid, MarketDataL2Level ask) {
        this.bid = bid;
        this.ask = ask;
    }
}
