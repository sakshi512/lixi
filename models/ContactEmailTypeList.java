package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ContactEmailTypeList {
    HOME, WORK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HOME: return "Home";
            case WORK: return "Work";
        }
        return null;
    }

    @JsonCreator
    public static ContactEmailTypeList forValue(String value) throws IOException {
        if (value.equals("Home")) return HOME;
        if (value.equals("Work")) return WORK;
        throw new IOException("Cannot deserialize ContactEmailTypeList");
    }
}
