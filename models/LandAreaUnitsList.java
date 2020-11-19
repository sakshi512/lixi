package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LandAreaUnitsList {
    ACRES, HECTARES, SQUARE_METRES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACRES: return "Acres";
            case HECTARES: return "Hectares";
            case SQUARE_METRES: return "Square Metres";
        }
        return null;
    }

    @JsonCreator
    public static LandAreaUnitsList forValue(String value) throws IOException {
        if (value.equals("Acres")) return ACRES;
        if (value.equals("Hectares")) return HECTARES;
        if (value.equals("Square Metres")) return SQUARE_METRES;
        throw new IOException("Cannot deserialize LandAreaUnitsList");
    }
}
