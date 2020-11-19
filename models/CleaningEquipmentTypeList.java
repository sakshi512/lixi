package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CleaningEquipmentTypeList {
    DRY_CLEANING, OTHER, VACUUM_EQUIPMENT, WASHERS_AND_DRYERS, WASTE_BINS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DRY_CLEANING: return "Dry Cleaning";
            case OTHER: return "Other";
            case VACUUM_EQUIPMENT: return "Vacuum Equipment";
            case WASHERS_AND_DRYERS: return "Washers and Dryers";
            case WASTE_BINS: return "Waste Bins";
        }
        return null;
    }

    @JsonCreator
    public static CleaningEquipmentTypeList forValue(String value) throws IOException {
        if (value.equals("Dry Cleaning")) return DRY_CLEANING;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Vacuum Equipment")) return VACUUM_EQUIPMENT;
        if (value.equals("Washers and Dryers")) return WASHERS_AND_DRYERS;
        if (value.equals("Waste Bins")) return WASTE_BINS;
        throw new IOException("Cannot deserialize CleaningEquipmentTypeList");
    }
}
