package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HospitalityAndLeisureTypeList {
    AIR_CONDITIONING, COOKING, GAMING, GARDEN, KITCHEN, OTHER, REFRIGERATION, SALON, SPA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR_CONDITIONING: return "Air Conditioning";
            case COOKING: return "Cooking";
            case GAMING: return "Gaming";
            case GARDEN: return "Garden";
            case KITCHEN: return "Kitchen";
            case OTHER: return "Other";
            case REFRIGERATION: return "Refrigeration";
            case SALON: return "Salon";
            case SPA: return "Spa";
        }
        return null;
    }

    @JsonCreator
    public static HospitalityAndLeisureTypeList forValue(String value) throws IOException {
        if (value.equals("Air Conditioning")) return AIR_CONDITIONING;
        if (value.equals("Cooking")) return COOKING;
        if (value.equals("Gaming")) return GAMING;
        if (value.equals("Garden")) return GARDEN;
        if (value.equals("Kitchen")) return KITCHEN;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Refrigeration")) return REFRIGERATION;
        if (value.equals("Salon")) return SALON;
        if (value.equals("Spa")) return SPA;
        throw new IOException("Cannot deserialize HospitalityAndLeisureTypeList");
    }
}
