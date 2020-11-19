package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConstructionTypeList {
    FULL_CONSTRUCTION, HOME_EXTENSION, HOUSE_LAND_PACKAGE, MINOR_NON_STRUCTURAL_REPAIRS, RENOVATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULL_CONSTRUCTION: return "Full Construction";
            case HOME_EXTENSION: return "Home Extension";
            case HOUSE_LAND_PACKAGE: return "House Land Package";
            case MINOR_NON_STRUCTURAL_REPAIRS: return "Minor Non Structural Repairs";
            case RENOVATION: return "Renovation";
        }
        return null;
    }

    @JsonCreator
    public static ConstructionTypeList forValue(String value) throws IOException {
        if (value.equals("Full Construction")) return FULL_CONSTRUCTION;
        if (value.equals("Home Extension")) return HOME_EXTENSION;
        if (value.equals("House Land Package")) return HOUSE_LAND_PACKAGE;
        if (value.equals("Minor Non Structural Repairs")) return MINOR_NON_STRUCTURAL_REPAIRS;
        if (value.equals("Renovation")) return RENOVATION;
        throw new IOException("Cannot deserialize ConstructionTypeList");
    }
}
