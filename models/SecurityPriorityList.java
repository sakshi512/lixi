package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SecurityPriorityList {
    FIRST_MORTGAGE, REGISTERED_SECURITY, SECOND_AFTER_DSH, SECOND_MORTGAGE, THIRD_MORTGAGE, UNREGISTERED_MORTGAGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FIRST_MORTGAGE: return "First Mortgage";
            case REGISTERED_SECURITY: return "Registered Security";
            case SECOND_AFTER_DSH: return "Second after DSH";
            case SECOND_MORTGAGE: return "Second Mortgage";
            case THIRD_MORTGAGE: return "Third Mortgage";
            case UNREGISTERED_MORTGAGE: return "Unregistered Mortgage";
        }
        return null;
    }

    @JsonCreator
    public static SecurityPriorityList forValue(String value) throws IOException {
        if (value.equals("First Mortgage")) return FIRST_MORTGAGE;
        if (value.equals("Registered Security")) return REGISTERED_SECURITY;
        if (value.equals("Second after DSH")) return SECOND_AFTER_DSH;
        if (value.equals("Second Mortgage")) return SECOND_MORTGAGE;
        if (value.equals("Third Mortgage")) return THIRD_MORTGAGE;
        if (value.equals("Unregistered Mortgage")) return UNREGISTERED_MORTGAGE;
        throw new IOException("Cannot deserialize SecurityPriorityList");
    }
}
