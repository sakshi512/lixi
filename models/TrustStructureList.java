package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TrustStructureList {
    DISCRETIONARY, FIXED, HYBRID, SIMPLE, UNIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DISCRETIONARY: return "Discretionary";
            case FIXED: return "Fixed";
            case HYBRID: return "Hybrid";
            case SIMPLE: return "Simple";
            case UNIT: return "Unit";
        }
        return null;
    }

    @JsonCreator
    public static TrustStructureList forValue(String value) throws IOException {
        if (value.equals("Discretionary")) return DISCRETIONARY;
        if (value.equals("Fixed")) return FIXED;
        if (value.equals("Hybrid")) return HYBRID;
        if (value.equals("Simple")) return SIMPLE;
        if (value.equals("Unit")) return UNIT;
        throw new IOException("Cannot deserialize TrustStructureList");
    }
}
