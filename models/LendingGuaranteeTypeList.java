package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LendingGuaranteeTypeList {
    INCOME_AND_SECURITY, INCOME_ONLY, SECURITY_ONLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INCOME_AND_SECURITY: return "Income and Security";
            case INCOME_ONLY: return "Income Only";
            case SECURITY_ONLY: return "Security Only";
        }
        return null;
    }

    @JsonCreator
    public static LendingGuaranteeTypeList forValue(String value) throws IOException {
        if (value.equals("Income and Security")) return INCOME_AND_SECURITY;
        if (value.equals("Income Only")) return INCOME_ONLY;
        if (value.equals("Security Only")) return SECURITY_ONLY;
        throw new IOException("Cannot deserialize LendingGuaranteeTypeList");
    }
}
