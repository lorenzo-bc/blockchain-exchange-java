package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.*;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;
import java.util.Iterator;

public class BalanceHandler extends AuthenticatedWebsocketClient {

    public BalanceHandler(URI endpointURI, String token) {
        super(endpointURI, token);
    }

    public void start() {
        connect();
    }

    @Override
    public void onAuthenticated() {
        super.onAuthenticated();
        Request request = new BalanceRequest();
        sendMessage(request);
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        BalanceSnapshot balanceSnapshot = Utils.gson().fromJson(message, BalanceSnapshot.class);
        onBalanceSnapshot(balanceSnapshot);
    }

    public void onBalanceSnapshot(BalanceSnapshot balanceSnapshot) {
        for (SingleCurrencyBalance balance : balanceSnapshot.balances) {
            System.out.printf(
                    "%s: total %f, available %f, reserved %f\n",
                    balance.currency,
                    balance.balance,
                    balance.available,
                    balance.balance - balance.available
            );
        }
    }
}
