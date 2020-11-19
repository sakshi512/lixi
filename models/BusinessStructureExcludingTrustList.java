package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BusinessStructureExcludingTrustList {
    COMPANY, PARTNERSHIP, SOLE_TRADER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPANY: return "Company";
            case PARTNERSHIP: return "Partnership";
            case SOLE_TRADER: return "Sole Trader";
        }
        return null;
    }

    @JsonCreator
    public static BusinessStructureExcludingTrustList forValue(String value) throws IOException {
        if (value.equals("Company")) return COMPANY;
        if (value.equals("Partnership")) return PARTNERSHIP;
        if (value.equals("Sole Trader")) return SOLE_TRADER;
        throw new IOException("Cannot deserialize BusinessStructureExcludingTrustList");
    }
}
