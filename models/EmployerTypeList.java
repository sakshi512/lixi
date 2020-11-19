package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EmployerTypeList {
    PRIVATE, PUBLIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PRIVATE: return "Private";
            case PUBLIC: return "Public";
        }
        return null;
    }

    @JsonCreator
    public static EmployerTypeList forValue(String value) throws IOException {
        if (value.equals("Private")) return PRIVATE;
        if (value.equals("Public")) return PUBLIC;
        throw new IOException("Cannot deserialize EmployerTypeList");
    }
}
