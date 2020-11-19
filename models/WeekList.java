package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum WeekList {
    FIRST, FOURTH, LAST, SECOND, THIRD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FIRST: return "First";
            case FOURTH: return "Fourth";
            case LAST: return "Last";
            case SECOND: return "Second";
            case THIRD: return "Third";
        }
        return null;
    }

    @JsonCreator
    public static WeekList forValue(String value) throws IOException {
        if (value.equals("First")) return FIRST;
        if (value.equals("Fourth")) return FOURTH;
        if (value.equals("Last")) return LAST;
        if (value.equals("Second")) return SECOND;
        if (value.equals("Third")) return THIRD;
        throw new IOException("Cannot deserialize WeekList");
    }
}
