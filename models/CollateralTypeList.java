package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CollateralTypeList {
    COMMERCIAL, CONSUMER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMMERCIAL: return "Commercial";
            case CONSUMER: return "Consumer";
        }
        return null;
    }

    @JsonCreator
    public static CollateralTypeList forValue(String value) throws IOException {
        if (value.equals("Commercial")) return COMMERCIAL;
        if (value.equals("Consumer")) return CONSUMER;
        throw new IOException("Cannot deserialize CollateralTypeList");
    }
}
