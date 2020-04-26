package com.blockchain.exchange.utils;


import com.blockchain.exchange.reference.types.response.SymbolStatus;
import com.blockchain.exchange.utils.gsonadapters.SymbolStatusSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {
    private static Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .setLenient()
            .registerTypeAdapter(SymbolStatus.class, new SymbolStatusSerializer())
            .create();

    public static Gson gson() {
        return gson;
    }
}
