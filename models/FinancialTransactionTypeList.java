package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FinancialTransactionTypeList {
    LEASEBACK, REFINANCE, ROLLOVER, SALE_AND_HIRE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LEASEBACK: return "Leaseback";
            case REFINANCE: return "Refinance";
            case ROLLOVER: return "Rollover";
            case SALE_AND_HIRE: return "Sale and Hire";
        }
        return null;
    }

    @JsonCreator
    public static FinancialTransactionTypeList forValue(String value) throws IOException {
        if (value.equals("Leaseback")) return LEASEBACK;
        if (value.equals("Refinance")) return REFINANCE;
        if (value.equals("Rollover")) return ROLLOVER;
        if (value.equals("Sale and Hire")) return SALE_AND_HIRE;
        throw new IOException("Cannot deserialize FinancialTransactionTypeList");
    }
}
