package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PrimaryPurposeRealEstateAssetList {
    BUSINESS, INVESTMENT, OWNER_OCCUPIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BUSINESS: return "Business";
            case INVESTMENT: return "Investment";
            case OWNER_OCCUPIED: return "Owner Occupied";
        }
        return null;
    }

    @JsonCreator
    public static PrimaryPurposeRealEstateAssetList forValue(String value) throws IOException {
        if (value.equals("Business")) return BUSINESS;
        if (value.equals("Investment")) return INVESTMENT;
        if (value.equals("Owner Occupied")) return OWNER_OCCUPIED;
        throw new IOException("Cannot deserialize PrimaryPurposeRealEstateAssetList");
    }
}
