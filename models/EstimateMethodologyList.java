package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EstimateMethodologyList {
    COMPLETED_CONSTRUCTION_VALUE, CURRENT_MARKET_VALUE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPLETED_CONSTRUCTION_VALUE: return "Completed Construction Value";
            case CURRENT_MARKET_VALUE: return "Current Market Value";
        }
        return null;
    }

    @JsonCreator
    public static EstimateMethodologyList forValue(String value) throws IOException {
        if (value.equals("Completed Construction Value")) return COMPLETED_CONSTRUCTION_VALUE;
        if (value.equals("Current Market Value")) return CURRENT_MARKET_VALUE;
        throw new IOException("Cannot deserialize EstimateMethodologyList");
    }
}
