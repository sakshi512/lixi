package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RealEstateAssetStatusList {
    ESTABLISHED, NEW_BUILDING, OFF_THE_PLAN, VACANT_LAND;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ESTABLISHED: return "Established";
            case NEW_BUILDING: return "New Building";
            case OFF_THE_PLAN: return "Off the Plan";
            case VACANT_LAND: return "Vacant Land";
        }
        return null;
    }

    @JsonCreator
    public static RealEstateAssetStatusList forValue(String value) throws IOException {
        if (value.equals("Established")) return ESTABLISHED;
        if (value.equals("New Building")) return NEW_BUILDING;
        if (value.equals("Off the Plan")) return OFF_THE_PLAN;
        if (value.equals("Vacant Land")) return VACANT_LAND;
        throw new IOException("Cannot deserialize RealEstateAssetStatusList");
    }
}
