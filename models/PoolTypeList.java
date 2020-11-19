package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PoolTypeList {
    ABOVE_GROUND, INGROUND;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ABOVE_GROUND: return "Above Ground";
            case INGROUND: return "Inground";
        }
        return null;
    }

    @JsonCreator
    public static PoolTypeList forValue(String value) throws IOException {
        if (value.equals("Above Ground")) return ABOVE_GROUND;
        if (value.equals("Inground")) return INGROUND;
        throw new IOException("Cannot deserialize PoolTypeList");
    }
}
