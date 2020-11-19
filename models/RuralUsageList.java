package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RuralUsageList {
    INCOME_PRODUCING, RURAL_LIFE, RURAL_RESIDENTIAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INCOME_PRODUCING: return "Income Producing";
            case RURAL_LIFE: return "Rural Life";
            case RURAL_RESIDENTIAL: return "Rural Residential";
        }
        return null;
    }

    @JsonCreator
    public static RuralUsageList forValue(String value) throws IOException {
        if (value.equals("Income Producing")) return INCOME_PRODUCING;
        if (value.equals("Rural Life")) return RURAL_LIFE;
        if (value.equals("Rural Residential")) return RURAL_RESIDENTIAL;
        throw new IOException("Cannot deserialize RuralUsageList");
    }
}
