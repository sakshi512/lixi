package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FeePaymentTimingList {
    BEFORE_CREDIT_DRAWDOWN, ON_CREDIT_DRAWDOWN, ON_EVENT_OCCURRENCE, REGULAR_RECURRING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEFORE_CREDIT_DRAWDOWN: return "Before Credit Drawdown";
            case ON_CREDIT_DRAWDOWN: return "On Credit Drawdown";
            case ON_EVENT_OCCURRENCE: return "On Event Occurrence";
            case REGULAR_RECURRING: return "Regular Recurring";
        }
        return null;
    }

    @JsonCreator
    public static FeePaymentTimingList forValue(String value) throws IOException {
        if (value.equals("Before Credit Drawdown")) return BEFORE_CREDIT_DRAWDOWN;
        if (value.equals("On Credit Drawdown")) return ON_CREDIT_DRAWDOWN;
        if (value.equals("On Event Occurrence")) return ON_EVENT_OCCURRENCE;
        if (value.equals("Regular Recurring")) return REGULAR_RECURRING;
        throw new IOException("Cannot deserialize FeePaymentTimingList");
    }
}
