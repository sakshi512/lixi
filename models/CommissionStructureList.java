package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CommissionStructureList {
    OTHER, TRAIL_ONLY, UP_FRONT_ONLY, UP_FRONT_PLUS_TRAIL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OTHER: return "Other";
            case TRAIL_ONLY: return "Trail Only";
            case UP_FRONT_ONLY: return "Up Front Only";
            case UP_FRONT_PLUS_TRAIL: return "Up Front Plus Trail";
        }
        return null;
    }

    @JsonCreator
    public static CommissionStructureList forValue(String value) throws IOException {
        if (value.equals("Other")) return OTHER;
        if (value.equals("Trail Only")) return TRAIL_ONLY;
        if (value.equals("Up Front Only")) return UP_FRONT_ONLY;
        if (value.equals("Up Front Plus Trail")) return UP_FRONT_PLUS_TRAIL;
        throw new IOException("Cannot deserialize CommissionStructureList");
    }
}
