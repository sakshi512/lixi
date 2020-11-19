package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PaymentTypeList {
    INTEREST_CAPITALISED, INTEREST_ONLY, PREPAID_INTEREST, PRINCIPAL_AND_INTEREST, PRINCIPAL_INTEREST_FEES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INTEREST_CAPITALISED: return "Interest Capitalised";
            case INTEREST_ONLY: return "Interest Only";
            case PREPAID_INTEREST: return "Prepaid Interest";
            case PRINCIPAL_AND_INTEREST: return "Principal and Interest";
            case PRINCIPAL_INTEREST_FEES: return "Principal Interest Fees";
        }
        return null;
    }

    @JsonCreator
    public static PaymentTypeList forValue(String value) throws IOException {
        if (value.equals("Interest Capitalised")) return INTEREST_CAPITALISED;
        if (value.equals("Interest Only")) return INTEREST_ONLY;
        if (value.equals("Prepaid Interest")) return PREPAID_INTEREST;
        if (value.equals("Principal and Interest")) return PRINCIPAL_AND_INTEREST;
        if (value.equals("Principal Interest Fees")) return PRINCIPAL_INTEREST_FEES;
        throw new IOException("Cannot deserialize PaymentTypeList");
    }
}
