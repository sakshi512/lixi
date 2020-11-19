package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CreditStatusList {
    CLEAN, UNKNOWN, WARNING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLEAN: return "Clean";
            case UNKNOWN: return "Unknown";
            case WARNING: return "Warning";
        }
        return null;
    }

    @JsonCreator
    public static CreditStatusList forValue(String value) throws IOException {
        if (value.equals("Clean")) return CLEAN;
        if (value.equals("Unknown")) return UNKNOWN;
        if (value.equals("Warning")) return WARNING;
        throw new IOException("Cannot deserialize CreditStatusList");
    }
}
