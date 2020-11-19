package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IncomeVerificationList {
    FULLY_VERIFIED, SELF_CERTIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULLY_VERIFIED: return "Fully Verified";
            case SELF_CERTIFIED: return "Self Certified";
        }
        return null;
    }

    @JsonCreator
    public static IncomeVerificationList forValue(String value) throws IOException {
        if (value.equals("Fully Verified")) return FULLY_VERIFIED;
        if (value.equals("Self Certified")) return SELF_CERTIFIED;
        throw new IOException("Cannot deserialize IncomeVerificationList");
    }
}
