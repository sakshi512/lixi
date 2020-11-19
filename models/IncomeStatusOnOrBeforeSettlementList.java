package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IncomeStatusOnOrBeforeSettlementList {
    ENDS, ONGOING, STARTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENDS: return "Ends";
            case ONGOING: return "Ongoing";
            case STARTS: return "Starts";
        }
        return null;
    }

    @JsonCreator
    public static IncomeStatusOnOrBeforeSettlementList forValue(String value) throws IOException {
        if (value.equals("Ends")) return ENDS;
        if (value.equals("Ongoing")) return ONGOING;
        if (value.equals("Starts")) return STARTS;
        throw new IOException("Cannot deserialize IncomeStatusOnOrBeforeSettlementList");
    }
}
