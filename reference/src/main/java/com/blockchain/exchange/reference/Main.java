package com.blockchain.exchange.reference;
import com.blockchain.exchange.reference.base.BalanceHandler;
import com.blockchain.exchange.reference.base.MarketDataL2;
import com.blockchain.exchange.reference.base.SymbolsHandler;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        String token = "";

        BalanceHandler balanceHandler = new BalanceHandler(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"), token);
        balanceHandler.start();

        SymbolsHandler symbolsHandler = new SymbolsHandler(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
        symbolsHandler.start();

        MarketDataL2 marketDataL2 = new MarketDataL2(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"));
        marketDataL2.start();

        for (int i = 0; i< 300; i++){
            Thread.sleep(1000);
        }
    }
}
