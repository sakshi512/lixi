package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AircraftTypeList {
    ENGINE, FIXED_WING_CYLINDER, FIXED_WING_JET, FIXED_WING_TURBO_PROP, HELICOPTER, OTHER, ULTRA_LIGHT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENGINE: return "Engine";
            case FIXED_WING_CYLINDER: return "Fixed Wing - Cylinder";
            case FIXED_WING_JET: return "Fixed Wing - Jet";
            case FIXED_WING_TURBO_PROP: return "Fixed Wing - Turbo Prop";
            case HELICOPTER: return "Helicopter";
            case OTHER: return "Other";
            case ULTRA_LIGHT: return "Ultra Light";
        }
        return null;
    }

    @JsonCreator
    public static AircraftTypeList forValue(String value) throws IOException {
        if (value.equals("Engine")) return ENGINE;
        if (value.equals("Fixed Wing - Cylinder")) return FIXED_WING_CYLINDER;
        if (value.equals("Fixed Wing - Jet")) return FIXED_WING_JET;
        if (value.equals("Fixed Wing - Turbo Prop")) return FIXED_WING_TURBO_PROP;
        if (value.equals("Helicopter")) return HELICOPTER;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Ultra Light")) return ULTRA_LIGHT;
        throw new IOException("Cannot deserialize AircraftTypeList");
    }
}
