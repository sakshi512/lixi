package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IndustrialTypeList {
    LIGHT_INDUSTRIAL, NON_SPECIALISED_INDUSTRIAL, OTHER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LIGHT_INDUSTRIAL: return "Light Industrial";
            case NON_SPECIALISED_INDUSTRIAL: return "Non Specialised Industrial";
            case OTHER: return "Other";
        }
        return null;
    }

    @JsonCreator
    public static IndustrialTypeList forValue(String value) throws IOException {
        if (value.equals("Light Industrial")) return LIGHT_INDUSTRIAL;
        if (value.equals("Non Specialised Industrial")) return NON_SPECIALISED_INDUSTRIAL;
        if (value.equals("Other")) return OTHER;
        throw new IOException("Cannot deserialize IndustrialTypeList");
    }
}
