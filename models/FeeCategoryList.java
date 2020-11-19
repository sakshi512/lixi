package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FeeCategoryList {
    BANK, GOVERNMENT, MORTGAGE_INSURER, OTHER, VALUER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANK: return "Bank";
            case GOVERNMENT: return "Government";
            case MORTGAGE_INSURER: return "Mortgage Insurer";
            case OTHER: return "Other";
            case VALUER: return "Valuer";
        }
        return null;
    }

    @JsonCreator
    public static FeeCategoryList forValue(String value) throws IOException {
        if (value.equals("Bank")) return BANK;
        if (value.equals("Government")) return GOVERNMENT;
        if (value.equals("Mortgage Insurer")) return MORTGAGE_INSURER;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Valuer")) return VALUER;
        throw new IOException("Cannot deserialize FeeCategoryList");
    }
}
