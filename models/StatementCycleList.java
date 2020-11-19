package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StatementCycleList {
    FORTNIGHTLY, HALF_YEARLY, MONTHLY, QUARTERLY, WEEKLY, YEARLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FORTNIGHTLY: return "Fortnightly";
            case HALF_YEARLY: return "Half Yearly";
            case MONTHLY: return "Monthly";
            case QUARTERLY: return "Quarterly";
            case WEEKLY: return "Weekly";
            case YEARLY: return "Yearly";
        }
        return null;
    }

    @JsonCreator
    public static StatementCycleList forValue(String value) throws IOException {
        if (value.equals("Fortnightly")) return FORTNIGHTLY;
        if (value.equals("Half Yearly")) return HALF_YEARLY;
        if (value.equals("Monthly")) return MONTHLY;
        if (value.equals("Quarterly")) return QUARTERLY;
        if (value.equals("Weekly")) return WEEKLY;
        if (value.equals("Yearly")) return YEARLY;
        throw new IOException("Cannot deserialize StatementCycleList");
    }
}
