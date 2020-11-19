package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OccupancyList {
    NON_OWNER, OWNER_PRIMARY, OWNER_SECONDARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NON_OWNER: return "Non Owner";
            case OWNER_PRIMARY: return "Owner Primary";
            case OWNER_SECONDARY: return "Owner Secondary";
        }
        return null;
    }

    @JsonCreator
    public static OccupancyList forValue(String value) throws IOException {
        if (value.equals("Non Owner")) return NON_OWNER;
        if (value.equals("Owner Primary")) return OWNER_PRIMARY;
        if (value.equals("Owner Secondary")) return OWNER_SECONDARY;
        throw new IOException("Cannot deserialize OccupancyList");
    }
}
