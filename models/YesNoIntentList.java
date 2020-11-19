package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum YesNoIntentList {
    FUTURE_INTENT, NO, YES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FUTURE_INTENT: return "Future Intent";
            case NO: return "No";
            case YES: return "Yes";
        }
        return null;
    }

    @JsonCreator
    public static YesNoIntentList forValue(String value) throws IOException {
        if (value.equals("Future Intent")) return FUTURE_INTENT;
        if (value.equals("No")) return NO;
        if (value.equals("Yes")) return YES;
        throw new IOException("Cannot deserialize YesNoIntentList");
    }
}
