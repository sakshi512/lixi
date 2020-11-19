package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LoanTermUnitsList {
    DAYS, MONTHS, WEEKS, YEARS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DAYS: return "Days";
            case MONTHS: return "Months";
            case WEEKS: return "Weeks";
            case YEARS: return "Years";
        }
        return null;
    }

    @JsonCreator
    public static LoanTermUnitsList forValue(String value) throws IOException {
        if (value.equals("Days")) return DAYS;
        if (value.equals("Months")) return MONTHS;
        if (value.equals("Weeks")) return WEEKS;
        if (value.equals("Years")) return YEARS;
        throw new IOException("Cannot deserialize LoanTermUnitsList");
    }
}
