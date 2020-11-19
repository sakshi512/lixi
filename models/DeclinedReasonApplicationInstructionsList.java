package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DeclinedReasonApplicationInstructionsList {
    AFFORDABILITY, CREDIT_HISTORY, EMPLOYMENT_SECURITY, LEVEL_OF_DEBT, SECURITY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AFFORDABILITY: return "Affordability";
            case CREDIT_HISTORY: return "Credit History";
            case EMPLOYMENT_SECURITY: return "Employment Security";
            case LEVEL_OF_DEBT: return "Level of Debt";
            case SECURITY: return "Security";
        }
        return null;
    }

    @JsonCreator
    public static DeclinedReasonApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Affordability")) return AFFORDABILITY;
        if (value.equals("Credit History")) return CREDIT_HISTORY;
        if (value.equals("Employment Security")) return EMPLOYMENT_SECURITY;
        if (value.equals("Level of Debt")) return LEVEL_OF_DEBT;
        if (value.equals("Security")) return SECURITY;
        throw new IOException("Cannot deserialize DeclinedReasonApplicationInstructionsList");
    }
}
