package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConditionList {
    DEMO, NEW, REFURBISHED, USED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEMO: return "Demo";
            case NEW: return "New";
            case REFURBISHED: return "Refurbished";
            case USED: return "Used";
        }
        return null;
    }

    @JsonCreator
    public static ConditionList forValue(String value) throws IOException {
        if (value.equals("Demo")) return DEMO;
        if (value.equals("New")) return NEW;
        if (value.equals("Refurbished")) return REFURBISHED;
        if (value.equals("Used")) return USED;
        throw new IOException("Cannot deserialize ConditionList");
    }
}
