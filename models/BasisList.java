package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BasisList {
    CASUAL, COMMISSION_ONLY, CONTRACT, FULL_TIME, PART_TIME, SEASONAL, TEMPORARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASUAL: return "Casual";
            case COMMISSION_ONLY: return "Commission Only";
            case CONTRACT: return "Contract";
            case FULL_TIME: return "Full Time";
            case PART_TIME: return "Part Time";
            case SEASONAL: return "Seasonal";
            case TEMPORARY: return "Temporary";
        }
        return null;
    }

    @JsonCreator
    public static BasisList forValue(String value) throws IOException {
        if (value.equals("Casual")) return CASUAL;
        if (value.equals("Commission Only")) return COMMISSION_ONLY;
        if (value.equals("Contract")) return CONTRACT;
        if (value.equals("Full Time")) return FULL_TIME;
        if (value.equals("Part Time")) return PART_TIME;
        if (value.equals("Seasonal")) return SEASONAL;
        if (value.equals("Temporary")) return TEMPORARY;
        throw new IOException("Cannot deserialize BasisList");
    }
}
