package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OfficeEquipmentTypeList {
    FIXTURES_AND_FITTINGS, OTHER, PHOTOCOPIER_PRINTER, TELEPHONE_SYSTEMS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FIXTURES_AND_FITTINGS: return "Fixtures and Fittings";
            case OTHER: return "Other";
            case PHOTOCOPIER_PRINTER: return "Photocopier/Printer";
            case TELEPHONE_SYSTEMS: return "Telephone Systems";
        }
        return null;
    }

    @JsonCreator
    public static OfficeEquipmentTypeList forValue(String value) throws IOException {
        if (value.equals("Fixtures and Fittings")) return FIXTURES_AND_FITTINGS;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Photocopier/Printer")) return PHOTOCOPIER_PRINTER;
        if (value.equals("Telephone Systems")) return TELEPHONE_SYSTEMS;
        throw new IOException("Cannot deserialize OfficeEquipmentTypeList");
    }
}
