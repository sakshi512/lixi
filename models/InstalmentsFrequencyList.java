package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InstalmentsFrequencyList {
    FORTNIGHTLY, MONTHLY, WEEKLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FORTNIGHTLY: return "Fortnightly";
            case MONTHLY: return "Monthly";
            case WEEKLY: return "Weekly";
        }
        return null;
    }

    @JsonCreator
    public static InstalmentsFrequencyList forValue(String value) throws IOException {
        if (value.equals("Fortnightly")) return FORTNIGHTLY;
        if (value.equals("Monthly")) return MONTHLY;
        if (value.equals("Weekly")) return WEEKLY;
        throw new IOException("Cannot deserialize InstalmentsFrequencyList");
    }
}
