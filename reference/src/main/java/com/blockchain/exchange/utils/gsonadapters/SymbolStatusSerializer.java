package com.blockchain.exchange.utils.gsonadapters;

import com.blockchain.exchange.reference.types.response.SymbolStatus;
import com.google.gson.*;

import java.lang.reflect.Type;


public class SymbolStatusSerializer implements JsonSerializer<SymbolStatus>, JsonDeserializer<SymbolStatus> {

    @Override
    public SymbolStatus deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        {
            String s = json.getAsString();
            if (s.equals("halt-freeze")) {
                return SymbolStatus.halt_freeze;
            }
            return SymbolStatus.valueOf(s);
        }
    }

    @Override
    public JsonElement serialize(SymbolStatus src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src.name());
    }
}
