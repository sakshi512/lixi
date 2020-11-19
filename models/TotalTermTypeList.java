package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TotalTermTypeList {
    AMORTISATION_TERM, TOTAL_TERM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMORTISATION_TERM: return "Amortisation Term";
            case TOTAL_TERM: return "Total Term";
        }
        return null;
    }

    @JsonCreator
    public static TotalTermTypeList forValue(String value) throws IOException {
        if (value.equals("Amortisation Term")) return AMORTISATION_TERM;
        if (value.equals("Total Term")) return TOTAL_TERM;
        throw new IOException("Cannot deserialize TotalTermTypeList");
    }
}
