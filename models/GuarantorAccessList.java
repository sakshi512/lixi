package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GuarantorAccessList {
    FULL_ACCESS, INFORMATION_ONLY_ACCESS, NO_ACCESS, TRANSACTING_ACCESS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULL_ACCESS: return "Full Access";
            case INFORMATION_ONLY_ACCESS: return "Information Only Access";
            case NO_ACCESS: return "No Access";
            case TRANSACTING_ACCESS: return "Transacting Access";
        }
        return null;
    }

    @JsonCreator
    public static GuarantorAccessList forValue(String value) throws IOException {
        if (value.equals("Full Access")) return FULL_ACCESS;
        if (value.equals("Information Only Access")) return INFORMATION_ONLY_ACCESS;
        if (value.equals("No Access")) return NO_ACCESS;
        if (value.equals("Transacting Access")) return TRANSACTING_ACCESS;
        throw new IOException("Cannot deserialize GuarantorAccessList");
    }
}
