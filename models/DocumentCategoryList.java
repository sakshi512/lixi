package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DocumentCategoryList {
    NON_PHOTOGRAPHIC, PHOTOGRAPHIC, SECONDARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NON_PHOTOGRAPHIC: return "Non Photographic";
            case PHOTOGRAPHIC: return "Photographic";
            case SECONDARY: return "Secondary";
        }
        return null;
    }

    @JsonCreator
    public static DocumentCategoryList forValue(String value) throws IOException {
        if (value.equals("Non Photographic")) return NON_PHOTOGRAPHIC;
        if (value.equals("Photographic")) return PHOTOGRAPHIC;
        if (value.equals("Secondary")) return SECONDARY;
        throw new IOException("Cannot deserialize DocumentCategoryList");
    }
}
