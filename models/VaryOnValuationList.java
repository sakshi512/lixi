package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VaryOnValuationList {
    CASH_RESERVE, INSTALMENTS, LUMP_SUM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASH_RESERVE: return "Cash Reserve";
            case INSTALMENTS: return "Instalments";
            case LUMP_SUM: return "Lump Sum";
        }
        return null;
    }

    @JsonCreator
    public static VaryOnValuationList forValue(String value) throws IOException {
        if (value.equals("Cash Reserve")) return CASH_RESERVE;
        if (value.equals("Instalments")) return INSTALMENTS;
        if (value.equals("Lump Sum")) return LUMP_SUM;
        throw new IOException("Cannot deserialize VaryOnValuationList");
    }
}
