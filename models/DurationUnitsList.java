package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DurationUnitsList {
    MONTHS, YEARS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MONTHS: return "Months";
            case YEARS: return "Years";
        }
        return null;
    }

    @JsonCreator
    public static DurationUnitsList forValue(String value) throws IOException {
        if (value.equals("Months")) return MONTHS;
        if (value.equals("Years")) return YEARS;
        throw new IOException("Cannot deserialize DurationUnitsList");
    }
}
