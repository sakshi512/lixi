package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CapacityTypeList {
    BANKER, BORROWER, DIRECTOR, GUARANTOR, SYSTEM, TRUSTEE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANKER: return "Banker";
            case BORROWER: return "Borrower";
            case DIRECTOR: return "Director";
            case GUARANTOR: return "Guarantor";
            case SYSTEM: return "System";
            case TRUSTEE: return "Trustee";
        }
        return null;
    }

    @JsonCreator
    public static CapacityTypeList forValue(String value) throws IOException {
        if (value.equals("Banker")) return BANKER;
        if (value.equals("Borrower")) return BORROWER;
        if (value.equals("Director")) return DIRECTOR;
        if (value.equals("Guarantor")) return GUARANTOR;
        if (value.equals("System")) return SYSTEM;
        if (value.equals("Trustee")) return TRUSTEE;
        throw new IOException("Cannot deserialize CapacityTypeList");
    }
}
