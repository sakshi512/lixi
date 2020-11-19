package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BusinessStructureFullList {
    COMPANY, PARTNERSHIP, SOLE_TRADER, TRUST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPANY: return "Company";
            case PARTNERSHIP: return "Partnership";
            case SOLE_TRADER: return "Sole Trader";
            case TRUST: return "Trust";
        }
        return null;
    }

    @JsonCreator
    public static BusinessStructureFullList forValue(String value) throws IOException {
        if (value.equals("Company")) return COMPANY;
        if (value.equals("Partnership")) return PARTNERSHIP;
        if (value.equals("Sole Trader")) return SOLE_TRADER;
        if (value.equals("Trust")) return TRUST;
        throw new IOException("Cannot deserialize BusinessStructureFullList");
    }
}
