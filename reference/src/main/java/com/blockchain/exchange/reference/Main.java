package com.blockchain.exchange.reference;
import com.blockchain.exchange.reference.base.BalanceHandler;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        String token = "";
        BalanceHandler balanceHandler = new BalanceHandler(new URI("wss://ws.prod.blockchain.info/mercury-gateway/v1/ws"), token);
        balanceHandler.start();

        for (int i = 0; i< 300; i++){
            Thread.sleep(1000);
        }
    }
}
