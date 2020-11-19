package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AssetTransactionList {
    OWNS, OWNS_EXISTING_MORTGAGE, PURCHASING, SOLD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OWNS: return "Owns";
            case OWNS_EXISTING_MORTGAGE: return "Owns Existing Mortgage";
            case PURCHASING: return "Purchasing";
            case SOLD: return "Sold";
        }
        return null;
    }

    @JsonCreator
    public static AssetTransactionList forValue(String value) throws IOException {
        if (value.equals("Owns")) return OWNS;
        if (value.equals("Owns Existing Mortgage")) return OWNS_EXISTING_MORTGAGE;
        if (value.equals("Purchasing")) return PURCHASING;
        if (value.equals("Sold")) return SOLD;
        throw new IOException("Cannot deserialize AssetTransactionList");
    }
}
