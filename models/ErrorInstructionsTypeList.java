package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ErrorInstructionsTypeList {
    DATA_ERROR, INFORMATION, SYSTEM_ERROR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DATA_ERROR: return "Data Error";
            case INFORMATION: return "Information";
            case SYSTEM_ERROR: return "System Error";
        }
        return null;
    }

    @JsonCreator
    public static ErrorInstructionsTypeList forValue(String value) throws IOException {
        if (value.equals("Data Error")) return DATA_ERROR;
        if (value.equals("Information")) return INFORMATION;
        if (value.equals("System Error")) return SYSTEM_ERROR;
        throw new IOException("Cannot deserialize ErrorInstructionsTypeList");
    }
}
