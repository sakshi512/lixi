package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MaritalStatusList {
    DE_FACTO, DIVORCED, MARRIED, SEPARATED, SINGLE, UNKNOWN, WIDOWED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DE_FACTO: return "De Facto";
            case DIVORCED: return "Divorced";
            case MARRIED: return "Married";
            case SEPARATED: return "Separated";
            case SINGLE: return "Single";
            case UNKNOWN: return "Unknown";
            case WIDOWED: return "Widowed";
        }
        return null;
    }

    @JsonCreator
    public static MaritalStatusList forValue(String value) throws IOException {
        if (value.equals("De Facto")) return DE_FACTO;
        if (value.equals("Divorced")) return DIVORCED;
        if (value.equals("Married")) return MARRIED;
        if (value.equals("Separated")) return SEPARATED;
        if (value.equals("Single")) return SINGLE;
        if (value.equals("Unknown")) return UNKNOWN;
        if (value.equals("Widowed")) return WIDOWED;
        throw new IOException("Cannot deserialize MaritalStatusList");
    }
}
