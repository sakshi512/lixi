package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TaxDepreciationMethodList {
    DIMINISHING_VALUE, STRAIGHT_LINE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DIMINISHING_VALUE: return "Diminishing Value";
            case STRAIGHT_LINE: return "Straight Line";
        }
        return null;
    }

    @JsonCreator
    public static TaxDepreciationMethodList forValue(String value) throws IOException {
        if (value.equals("Diminishing Value")) return DIMINISHING_VALUE;
        if (value.equals("Straight Line")) return STRAIGHT_LINE;
        throw new IOException("Cannot deserialize TaxDepreciationMethodList");
    }
}
