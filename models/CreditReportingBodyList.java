package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CreditReportingBodyList {
    D_AND_B, EXPERIAN, VEDA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case D_AND_B: return "D and B";
            case EXPERIAN: return "Experian";
            case VEDA: return "Veda";
        }
        return null;
    }

    @JsonCreator
    public static CreditReportingBodyList forValue(String value) throws IOException {
        if (value.equals("D and B")) return D_AND_B;
        if (value.equals("Experian")) return EXPERIAN;
        if (value.equals("Veda")) return VEDA;
        throw new IOException("Cannot deserialize CreditReportingBodyList");
    }
}
