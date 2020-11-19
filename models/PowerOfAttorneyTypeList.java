package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PowerOfAttorneyTypeList {
    COMPANY, ENDURING, GENERAL, OTHER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPANY: return "Company";
            case ENDURING: return "Enduring";
            case GENERAL: return "General";
            case OTHER: return "Other";
        }
        return null;
    }

    @JsonCreator
    public static PowerOfAttorneyTypeList forValue(String value) throws IOException {
        if (value.equals("Company")) return COMPANY;
        if (value.equals("Enduring")) return ENDURING;
        if (value.equals("General")) return GENERAL;
        if (value.equals("Other")) return OTHER;
        throw new IOException("Cannot deserialize PowerOfAttorneyTypeList");
    }
}
