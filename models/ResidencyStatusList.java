package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResidencyStatusList {
    NON_RESIDENT, PERMANENTLY_IN_AUSTRALIA, TEMPORARILY_IN_AUSTRALIA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NON_RESIDENT: return "Non Resident";
            case PERMANENTLY_IN_AUSTRALIA: return "Permanently in Australia";
            case TEMPORARILY_IN_AUSTRALIA: return "Temporarily in Australia";
        }
        return null;
    }

    @JsonCreator
    public static ResidencyStatusList forValue(String value) throws IOException {
        if (value.equals("Non Resident")) return NON_RESIDENT;
        if (value.equals("Permanently in Australia")) return PERMANENTLY_IN_AUSTRALIA;
        if (value.equals("Temporarily in Australia")) return TEMPORARILY_IN_AUSTRALIA;
        throw new IOException("Cannot deserialize ResidencyStatusList");
    }
}
