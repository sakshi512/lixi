package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OecdCRSStatusList {
    ACTIVE, PASSIVE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTIVE: return "Active";
            case PASSIVE: return "Passive";
        }
        return null;
    }

    @JsonCreator
    public static OecdCRSStatusList forValue(String value) throws IOException {
        if (value.equals("Active")) return ACTIVE;
        if (value.equals("Passive")) return PASSIVE;
        throw new IOException("Cannot deserialize OecdCRSStatusList");
    }
}
