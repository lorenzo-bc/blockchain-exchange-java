package com.blockchain.exchange.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {
    private static Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .setLenient()
            .create();

    public static Gson gson() {
        return gson;
    }
}
