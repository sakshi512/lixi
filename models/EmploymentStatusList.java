package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EmploymentStatusList {
    PREVIOUS, PRIMARY, SECONDARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PREVIOUS: return "Previous";
            case PRIMARY: return "Primary";
            case SECONDARY: return "Secondary";
        }
        return null;
    }

    @JsonCreator
    public static EmploymentStatusList forValue(String value) throws IOException {
        if (value.equals("Previous")) return PREVIOUS;
        if (value.equals("Primary")) return PRIMARY;
        if (value.equals("Secondary")) return SECONDARY;
        throw new IOException("Cannot deserialize EmploymentStatusList");
    }
}
