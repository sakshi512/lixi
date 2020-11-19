package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RegistrationEventTypeList {
    AMENDMENT, CREATION, DISCHARGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMENDMENT: return "Amendment";
            case CREATION: return "Creation";
            case DISCHARGE: return "Discharge";
        }
        return null;
    }

    @JsonCreator
    public static RegistrationEventTypeList forValue(String value) throws IOException {
        if (value.equals("Amendment")) return AMENDMENT;
        if (value.equals("Creation")) return CREATION;
        if (value.equals("Discharge")) return DISCHARGE;
        throw new IOException("Cannot deserialize RegistrationEventTypeList");
    }
}
