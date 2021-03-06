package com.blockchain.exchange.reference.base;

import com.blockchain.exchange.reference.types.request.Request;
import com.blockchain.exchange.reference.types.request.SymbolsRequest;
import com.blockchain.exchange.reference.types.response.Response;
import com.blockchain.exchange.reference.types.response.SymbolSpecification;
import com.blockchain.exchange.reference.types.response.SymbolsSnapshot;
import com.blockchain.exchange.reference.types.response.SymbolsUpdate;
import com.blockchain.exchange.utils.Utils;
import com.google.gson.JsonObject;

import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.net.URI;
import java.util.Map;

/**
 * https://exchange.blockchain.com/api/?code#symbols
 */
public class SymbolsModule extends WebsocketClientEndpoint {

    public SymbolsModule(URI endpointURI) {
        super(endpointURI);
    }

    public void start() {
        connect();
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        super.onOpen(session, config);
        Request request = new SymbolsRequest();
        sendMessage(request);
    }

    @Override
    public void onSnapshot(JsonObject message, Response response) {
        super.onSnapshot(message, response);
        SymbolsSnapshot symbolsSnapshot = Utils.gson().fromJson(message, SymbolsSnapshot.class);
        onSymbolsSnapshot(symbolsSnapshot);
    }

    public void onSymbolsSnapshot(SymbolsSnapshot symbolsSnapshot) {
        for (Map.Entry<String, SymbolSpecification> symbol : symbolsSnapshot.symbols.entrySet()) {
            SymbolSpecification v = symbol.getValue();
            Double priceIncrement = v.min_price_increment * Math.pow (10, -v.min_price_increment_scale);
            Double minOrderSize = v.min_order_size * Math.pow (10, -v.min_order_size_scale);
            // 0 means no limit
            Double maxOrderSize = v.max_order_size * Math.pow (10, -v.max_order_size_scale);
            System.out.printf("%s: status %s, priceIncrement %f, minOrderSize %f, maxOrderSize %f\n",
                    symbol.getKey(),
                    v.status,
                    priceIncrement,
                    minOrderSize,
                    maxOrderSize);
        }
    }

    @Override
    public void onUpdate(JsonObject message, Response response) {
        super.onUpdate(message, response);
        SymbolsUpdate symbolsUpdate = Utils.gson().fromJson(message, SymbolsUpdate.class);
        onSymbolsUpdate(symbolsUpdate, message);
    }

    public void onSymbolsUpdate(SymbolsUpdate symbolsUpdate, JsonObject message) {
        SymbolSpecification v = Utils.gson().fromJson(message, SymbolSpecification.class);
        Double priceIncrement = v.min_price_increment * Math.pow (10, -v.min_price_increment_scale);
        Double minOrderSize = v.min_order_size * Math.pow (10, -v.min_order_size_scale);
        // 0 means no limit
        Double maxOrderSize = v.max_order_size * Math.pow (10, -v.max_order_size_scale);
        System.out.printf("%s: status %s, priceIncrement %f, minOrderSize %f, maxOrderSize %f\n",
                symbolsUpdate.symbol,
                v.status,
                priceIncrement,
                minOrderSize,
                maxOrderSize);
    }
}
