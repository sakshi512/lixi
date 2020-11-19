package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RepaymentFrequencyList {
    DAILY, FORTNIGHTLY, HALF_YEARLY, MONTHLY, ONE_OFF, QUARTERLY, SEASONAL, WEEKLY, YEARLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DAILY: return "Daily";
            case FORTNIGHTLY: return "Fortnightly";
            case HALF_YEARLY: return "Half Yearly";
            case MONTHLY: return "Monthly";
            case ONE_OFF: return "One Off";
            case QUARTERLY: return "Quarterly";
            case SEASONAL: return "Seasonal";
            case WEEKLY: return "Weekly";
            case YEARLY: return "Yearly";
        }
        return null;
    }

    @JsonCreator
    public static RepaymentFrequencyList forValue(String value) throws IOException {
        if (value.equals("Daily")) return DAILY;
        if (value.equals("Fortnightly")) return FORTNIGHTLY;
        if (value.equals("Half Yearly")) return HALF_YEARLY;
        if (value.equals("Monthly")) return MONTHLY;
        if (value.equals("One Off")) return ONE_OFF;
        if (value.equals("Quarterly")) return QUARTERLY;
        if (value.equals("Seasonal")) return SEASONAL;
        if (value.equals("Weekly")) return WEEKLY;
        if (value.equals("Yearly")) return YEARLY;
        throw new IOException("Cannot deserialize RepaymentFrequencyList");
    }
}
