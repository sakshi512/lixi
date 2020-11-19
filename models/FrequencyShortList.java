package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FrequencyShortList {
    FORTNIGHTLY, MONTHLY, WEEKLY, YEARLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FORTNIGHTLY: return "Fortnightly";
            case MONTHLY: return "Monthly";
            case WEEKLY: return "Weekly";
            case YEARLY: return "Yearly";
        }
        return null;
    }

    @JsonCreator
    public static FrequencyShortList forValue(String value) throws IOException {
        if (value.equals("Fortnightly")) return FORTNIGHTLY;
        if (value.equals("Monthly")) return MONTHLY;
        if (value.equals("Weekly")) return WEEKLY;
        if (value.equals("Yearly")) return YEARLY;
        throw new IOException("Cannot deserialize FrequencyShortList");
    }
}
