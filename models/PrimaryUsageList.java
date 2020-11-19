package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PrimaryUsageList {
    COMMERCIAL, INDUSTRIAL, RESIDENTIAL, RURAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMMERCIAL: return "Commercial";
            case INDUSTRIAL: return "Industrial";
            case RESIDENTIAL: return "Residential";
            case RURAL: return "Rural";
        }
        return null;
    }

    @JsonCreator
    public static PrimaryUsageList forValue(String value) throws IOException {
        if (value.equals("Commercial")) return COMMERCIAL;
        if (value.equals("Industrial")) return INDUSTRIAL;
        if (value.equals("Residential")) return RESIDENTIAL;
        if (value.equals("Rural")) return RURAL;
        throw new IOException("Cannot deserialize PrimaryUsageList");
    }
}
