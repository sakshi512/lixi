package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LIXIVersion {
    THE_2617;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_2617: return "2.6.17";
        }
        return null;
    }

    @JsonCreator
    public static LIXIVersion forValue(String value) throws IOException {
        if (value.equals("2.6.17")) return THE_2617;
        throw new IOException("Cannot deserialize LIXIVersion");
    }
}
