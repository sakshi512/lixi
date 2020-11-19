package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MobileComputingTypeList {
    LAPTOP, OTHER, SMART_PHONE, TABLET, WEARABLE_DEVICE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LAPTOP: return "Laptop";
            case OTHER: return "Other";
            case SMART_PHONE: return "Smart Phone";
            case TABLET: return "Tablet";
            case WEARABLE_DEVICE: return "Wearable Device";
        }
        return null;
    }

    @JsonCreator
    public static MobileComputingTypeList forValue(String value) throws IOException {
        if (value.equals("Laptop")) return LAPTOP;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Smart Phone")) return SMART_PHONE;
        if (value.equals("Tablet")) return TABLET;
        if (value.equals("Wearable Device")) return WEARABLE_DEVICE;
        throw new IOException("Cannot deserialize MobileComputingTypeList");
    }
}
