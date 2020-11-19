package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TrustPurposeList {
    FAMILY_TRUST, PROTECTIVE, SECURITY_TRUST, SMSF, TRADING_TRUST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FAMILY_TRUST: return "Family Trust";
            case PROTECTIVE: return "Protective";
            case SECURITY_TRUST: return "Security Trust";
            case SMSF: return "SMSF";
            case TRADING_TRUST: return "Trading Trust";
        }
        return null;
    }

    @JsonCreator
    public static TrustPurposeList forValue(String value) throws IOException {
        if (value.equals("Family Trust")) return FAMILY_TRUST;
        if (value.equals("Protective")) return PROTECTIVE;
        if (value.equals("Security Trust")) return SECURITY_TRUST;
        if (value.equals("SMSF")) return SMSF;
        if (value.equals("Trading Trust")) return TRADING_TRUST;
        throw new IOException("Cannot deserialize TrustPurposeList");
    }
}
