package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ExemptStatusList {
    EXEMPT, NON_EXEMPT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXEMPT: return "Exempt";
            case NON_EXEMPT: return "Non Exempt";
        }
        return null;
    }

    @JsonCreator
    public static ExemptStatusList forValue(String value) throws IOException {
        if (value.equals("Exempt")) return EXEMPT;
        if (value.equals("Non Exempt")) return NON_EXEMPT;
        throw new IOException("Cannot deserialize ExemptStatusList");
    }
}
