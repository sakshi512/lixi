package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RuralTypeList {
    OVER_40_HECTARES, OVER_8_LESS_THAN_40_HECTARES, THE_8_HECTARES_OR_LESS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OVER_40_HECTARES: return "Over 40 Hectares";
            case OVER_8_LESS_THAN_40_HECTARES: return "Over 8 Less than 40 Hectares";
            case THE_8_HECTARES_OR_LESS: return "8 Hectares or Less";
        }
        return null;
    }

    @JsonCreator
    public static RuralTypeList forValue(String value) throws IOException {
        if (value.equals("Over 40 Hectares")) return OVER_40_HECTARES;
        if (value.equals("Over 8 Less than 40 Hectares")) return OVER_8_LESS_THAN_40_HECTARES;
        if (value.equals("8 Hectares or Less")) return THE_8_HECTARES_OR_LESS;
        throw new IOException("Cannot deserialize RuralTypeList");
    }
}
