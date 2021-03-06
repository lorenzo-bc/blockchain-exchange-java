package com.blockchain.exchange.reference;
import com.blockchain.exchange.reference.base.*;
import com.blockchain.exchange.reference.impl.SnipingTradingLogic;
import com.blockchain.exchange.reference.impl.TradingLogic;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        String token = "YOUR TOKEN HERE";

        // use this to see your balance
//        BalanceModule balanceHandler = new BalanceModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"), token);
//        balanceHandler.start();
        // use this to see the symbols
//        SymbolsModule symbolsHandler = new SymbolsModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        symbolsHandler.start();
        MarketDataL2Module marketDataL2 = new MarketDataL2Module(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        MarketDataL3Module marketDataL3 = new MarketDataL3Module(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        marketDataL3.start( "BTC-USD");
//        CandlesModule candles = new CandlesModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        candles.start(60);
//        TickerModule ticker = new TickerModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        ticker.start(Arrays.asList("DGLD-USD", "ETH-BTC", "BTC-TRY"));
//        TradesModule trades = new TradesModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
//        trades.start(Arrays.asList("ETH-BTC", "ETH-USD", "XLM-USD", "BTC-TRY"));

        TradingModule tradingHandler = new TradingModule(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"), token);
//        TradingLogic tradingLogic = new TradingLogic(tradingHandler);
//        tradingHandler.addCallback(tradingLogic);
//        tradingHandler.start();


        // Use SnipingTradingLogic to snipe for good prices
        SnipingTradingLogic sniper = new SnipingTradingLogic(tradingHandler, marketDataL2);
        marketDataL2.addCallback(sniper);
        tradingHandler.addCallback(sniper);
        sniper.start();

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
