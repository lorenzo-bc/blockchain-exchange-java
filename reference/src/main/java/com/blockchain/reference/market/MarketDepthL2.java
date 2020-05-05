package com.blockchain.reference.market;

import com.blockchain.exchange.reference.types.response.MarketDataL2Level;
import com.blockchain.exchange.reference.types.response.MarketDataL2Snapshot;
import com.blockchain.exchange.reference.types.response.MarketDataL2Update;

import java.util.*;

public class MarketDepthL2 {
    private Comparator<MarketDataL2Level> bidComparator = new Comparator<MarketDataL2Level>() {
        @Override
        public int compare(MarketDataL2Level MarketDataL2Level, MarketDataL2Level t1) {
            if (MarketDataL2Level.px.equals(t1.px))
                return 0;
            if (MarketDataL2Level.px > t1.px)
                return -1;
            return 1;
        }
    };
    
    private Comparator<MarketDataL2Level> askComparator = new Comparator<MarketDataL2Level>() {
        @Override
        public int compare(MarketDataL2Level MarketDataL2Level, MarketDataL2Level t1) {
            if (MarketDataL2Level.px.equals(t1.px))
                return 0;
            if (MarketDataL2Level.px < t1.px)
                return -1;
            return 1;
        }
    };

    public SortedSet<MarketDataL2Level> bidDepthItems = new TreeSet<MarketDataL2Level>(bidComparator);
    public SortedSet<MarketDataL2Level> askDepthItems = new TreeSet<MarketDataL2Level>(askComparator);

    public void update(MarketDataL2Snapshot snapshot) {
        bidDepthItems.clear();
        bidDepthItems.addAll(snapshot.bids);
        askDepthItems.clear();
        askDepthItems.addAll(snapshot.asks);
    }

    public void update(MarketDataL2Update update) {
        bidDepthItems.addAll(update.bids);
        askDepthItems.addAll(update.asks);
    }

    public void invalidate() {
        bidDepthItems.clear();
        askDepthItems.clear();
    }

    public TopOfTheBookL2 getTopOfTheBook() {
        return new TopOfTheBookL2(bidDepthItems.first(), askDepthItems.first());
    }

    public Double totalBidVolume() {
        Double volume = 0.0;
        for( MarketDataL2Level l :  bidDepthItems) {
            volume += l.qty;
        }
        return volume;
    }

    public Double totalAskVolume() {
        Double volume = 0.0;
        for( MarketDataL2Level l :  askDepthItems) {
            volume += l.qty;
        }
        return volume;
    }
}
