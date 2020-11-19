package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ApplicationDocTypeList {
    FULL_DOC, LO_DOC, NO_DOC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULL_DOC: return "Full Doc";
            case LO_DOC: return "Lo Doc";
            case NO_DOC: return "No Doc";
        }
        return null;
    }

    @JsonCreator
    public static ApplicationDocTypeList forValue(String value) throws IOException {
        if (value.equals("Full Doc")) return FULL_DOC;
        if (value.equals("Lo Doc")) return LO_DOC;
        if (value.equals("No Doc")) return NO_DOC;
        throw new IOException("Cannot deserialize ApplicationDocTypeList");
    }
}
