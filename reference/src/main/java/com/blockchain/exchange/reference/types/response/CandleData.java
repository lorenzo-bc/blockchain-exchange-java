package com.blockchain.exchange.reference.types.response;

public class CandleData {
    public Long timestamp;
    public double open;
    public double high;
    public double low;
    public double close;
    public double volume;

    public CandleData(
        Long timestamp,
        double open,
        double high,
        double low,
        double close,
        double volume
    ) {
        this.timestamp = timestamp;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }

    public String toString() {
        return String.format(
                "%d = OPEN %f, HIGH %f, LOW %f, CLOSE %f, VOLUME %f",
                timestamp, open, high, low, close, volume
                );
    }
}
