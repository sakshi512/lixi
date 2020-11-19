package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProportionsList {
    EQUAL, NOT_SPECIFIED, SPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EQUAL: return "Equal";
            case NOT_SPECIFIED: return "Not Specified";
            case SPECIFIED: return "Specified";
        }
        return null;
    }

    @JsonCreator
    public static ProportionsList forValue(String value) throws IOException {
        if (value.equals("Equal")) return EQUAL;
        if (value.equals("Not Specified")) return NOT_SPECIFIED;
        if (value.equals("Specified")) return SPECIFIED;
        throw new IOException("Cannot deserialize ProportionsList");
    }
}
