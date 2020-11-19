package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClearingFromList {
    NO, PARTIAL, YES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NO: return "No";
            case PARTIAL: return "Partial";
            case YES: return "Yes";
        }
        return null;
    }

    @JsonCreator
    public static ClearingFromList forValue(String value) throws IOException {
        if (value.equals("No")) return NO;
        if (value.equals("Partial")) return PARTIAL;
        if (value.equals("Yes")) return YES;
        throw new IOException("Cannot deserialize ClearingFromList");
    }
}
