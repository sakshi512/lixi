package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HousingStatusList {
    BOARDING, CARAVAN, OTHER, OWN_HOME, OWN_HOME_MORTGAGE, RENTING, SUPPLIED_BY_EMPLOYER, WITH_PARENTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOARDING: return "Boarding";
            case CARAVAN: return "Caravan";
            case OTHER: return "Other";
            case OWN_HOME: return "Own Home";
            case OWN_HOME_MORTGAGE: return "Own Home Mortgage";
            case RENTING: return "Renting";
            case SUPPLIED_BY_EMPLOYER: return "Supplied by Employer";
            case WITH_PARENTS: return "With Parents";
        }
        return null;
    }

    @JsonCreator
    public static HousingStatusList forValue(String value) throws IOException {
        if (value.equals("Boarding")) return BOARDING;
        if (value.equals("Caravan")) return CARAVAN;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Own Home")) return OWN_HOME;
        if (value.equals("Own Home Mortgage")) return OWN_HOME_MORTGAGE;
        if (value.equals("Renting")) return RENTING;
        if (value.equals("Supplied by Employer")) return SUPPLIED_BY_EMPLOYER;
        if (value.equals("With Parents")) return WITH_PARENTS;
        throw new IOException("Cannot deserialize HousingStatusList");
    }
}
