package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InterestTypeList {
    FIXED_RATE, VARIABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FIXED_RATE: return "Fixed Rate";
            case VARIABLE: return "Variable";
        }
        return null;
    }

    @JsonCreator
    public static InterestTypeList forValue(String value) throws IOException {
        if (value.equals("Fixed Rate")) return FIXED_RATE;
        if (value.equals("Variable")) return VARIABLE;
        throw new IOException("Cannot deserialize InterestTypeList");
    }
}
