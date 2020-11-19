package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LandValueEstimateBasisList {
    ESTIMATED_MARKET_VALUE, PURCHASE_PRICE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ESTIMATED_MARKET_VALUE: return "Estimated Market Value";
            case PURCHASE_PRICE: return "Purchase Price";
        }
        return null;
    }

    @JsonCreator
    public static LandValueEstimateBasisList forValue(String value) throws IOException {
        if (value.equals("Estimated Market Value")) return ESTIMATED_MARKET_VALUE;
        if (value.equals("Purchase Price")) return PURCHASE_PRICE;
        throw new IOException("Cannot deserialize LandValueEstimateBasisList");
    }
}
