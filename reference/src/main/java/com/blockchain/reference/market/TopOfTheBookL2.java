package com.blockchain.reference.market;

import com.blockchain.exchange.reference.types.response.MarketDataL2Level;

public class TopOfTheBookL2 {
    public MarketDataL2Level bid;
    public MarketDataL2Level ask;

    public TopOfTheBookL2(MarketDataL2Level bid, MarketDataL2Level ask) {
        this.bid = bid;
        this.ask = ask;
    }

    @Override
    public String toString() {
        return String.format(
                "BID %f@%s , ASK %f@%f",
                bid.qty, bid.px, ask.qty, ask.px
        );
    }
}
