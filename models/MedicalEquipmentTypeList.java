package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MedicalEquipmentTypeList {
    DIAGNOSTIC_EQUIPMENT, IMAGING_EQUIPMENT, LABORATORY_EQUIPMENT, OTHER, THERAPY_SYSTEMS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DIAGNOSTIC_EQUIPMENT: return "Diagnostic Equipment";
            case IMAGING_EQUIPMENT: return "Imaging Equipment";
            case LABORATORY_EQUIPMENT: return "Laboratory Equipment";
            case OTHER: return "Other";
            case THERAPY_SYSTEMS: return "Therapy Systems";
        }
        return null;
    }

    @JsonCreator
    public static MedicalEquipmentTypeList forValue(String value) throws IOException {
        if (value.equals("Diagnostic Equipment")) return DIAGNOSTIC_EQUIPMENT;
        if (value.equals("Imaging Equipment")) return IMAGING_EQUIPMENT;
        if (value.equals("Laboratory Equipment")) return LABORATORY_EQUIPMENT;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Therapy Systems")) return THERAPY_SYSTEMS;
        throw new IOException("Cannot deserialize MedicalEquipmentTypeList");
    }
}
