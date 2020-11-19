package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InterestRateTypeList {
    BASIC_VARIABLE, FIXED, SPLIT, STANDARD_VARIABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BASIC_VARIABLE: return "Basic Variable";
            case FIXED: return "Fixed";
            case SPLIT: return "Split";
            case STANDARD_VARIABLE: return "Standard Variable";
        }
        return null;
    }

    @JsonCreator
    public static InterestRateTypeList forValue(String value) throws IOException {
        if (value.equals("Basic Variable")) return BASIC_VARIABLE;
        if (value.equals("Fixed")) return FIXED;
        if (value.equals("Split")) return SPLIT;
        if (value.equals("Standard Variable")) return STANDARD_VARIABLE;
        throw new IOException("Cannot deserialize InterestRateTypeList");
    }
}
