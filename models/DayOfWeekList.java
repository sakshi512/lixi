package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DayOfWeekList {
    FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FRIDAY: return "Friday";
            case MONDAY: return "Monday";
            case SATURDAY: return "Saturday";
            case SUNDAY: return "Sunday";
            case THURSDAY: return "Thursday";
            case TUESDAY: return "Tuesday";
            case WEDNESDAY: return "Wednesday";
        }
        return null;
    }

    @JsonCreator
    public static DayOfWeekList forValue(String value) throws IOException {
        if (value.equals("Friday")) return FRIDAY;
        if (value.equals("Monday")) return MONDAY;
        if (value.equals("Saturday")) return SATURDAY;
        if (value.equals("Sunday")) return SUNDAY;
        if (value.equals("Thursday")) return THURSDAY;
        if (value.equals("Tuesday")) return TUESDAY;
        if (value.equals("Wednesday")) return WEDNESDAY;
        throw new IOException("Cannot deserialize DayOfWeekList");
    }
}
