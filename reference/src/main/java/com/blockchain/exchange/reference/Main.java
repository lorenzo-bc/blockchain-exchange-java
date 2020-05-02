package com.blockchain.exchange.reference;
import com.blockchain.exchange.reference.base.*;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
//        String token = "ADD YOUR TOKEN HERE";

//        BalanceModule balanceHandler = new BalanceModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"), token);
//        balanceHandler.start();
//        SymbolsModule symbolsHandler = new SymbolsModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        symbolsHandler.start();
//        MarketDataL2Module marketDataL2 = new MarketDataL2Module(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        marketDataL2.start( "BTC-USD");
//        MarketDataL3Module marketDataL3 = new MarketDataL3Module(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        marketDataL3.start( "BTC-USD");
//        CandlesModule candles = new CandlesModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        candles.start(60);

        Runnable r = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
