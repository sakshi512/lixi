package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GenderList {
    FEMALE, MALE, UNDISCLOSED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FEMALE: return "Female";
            case MALE: return "Male";
            case UNDISCLOSED: return "Undisclosed";
        }
        return null;
    }

    @JsonCreator
    public static GenderList forValue(String value) throws IOException {
        if (value.equals("Female")) return FEMALE;
        if (value.equals("Male")) return MALE;
        if (value.equals("Undisclosed")) return UNDISCLOSED;
        throw new IOException("Cannot deserialize GenderList");
    }
}
