package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ReleaseSecurityReasonList {
    DEBT_REDUCTION, DISSOLVING_PARTNERSHIP, NO_LONGER_REQUIRED, REFINANCING_WITH_ANOTHER_LENDER, SALE_OF_PROPERTY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEBT_REDUCTION: return "Debt Reduction";
            case DISSOLVING_PARTNERSHIP: return "Dissolving Partnership";
            case NO_LONGER_REQUIRED: return "No Longer Required";
            case REFINANCING_WITH_ANOTHER_LENDER: return "Refinancing with Another Lender";
            case SALE_OF_PROPERTY: return "Sale of Property";
        }
        return null;
    }

    @JsonCreator
    public static ReleaseSecurityReasonList forValue(String value) throws IOException {
        if (value.equals("Debt Reduction")) return DEBT_REDUCTION;
        if (value.equals("Dissolving Partnership")) return DISSOLVING_PARTNERSHIP;
        if (value.equals("No Longer Required")) return NO_LONGER_REQUIRED;
        if (value.equals("Refinancing with Another Lender")) return REFINANCING_WITH_ANOTHER_LENDER;
        if (value.equals("Sale of Property")) return SALE_OF_PROPERTY;
        throw new IOException("Cannot deserialize ReleaseSecurityReasonList");
    }
}
