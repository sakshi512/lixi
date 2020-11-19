package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MedicareCardColourList {
    BLUE, GREEN, YELLOW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BLUE: return "Blue";
            case GREEN: return "Green";
            case YELLOW: return "Yellow";
        }
        return null;
    }

    @JsonCreator
    public static MedicareCardColourList forValue(String value) throws IOException {
        if (value.equals("Blue")) return BLUE;
        if (value.equals("Green")) return GREEN;
        if (value.equals("Yellow")) return YELLOW;
        throw new IOException("Cannot deserialize MedicareCardColourList");
    }
}
