package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.BalanceRequest;
import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.response.BalanceSnapshot;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.reference.types.response.SingleCurrencyBalance;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import java.net.URI;

/**
 * https://exchange.blockchain.com/api/#balances
 */
public class BalanceModule extends AuthenticatedWebsocketClient {

    public BalanceModule(URI endpointURI, String token) {
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
