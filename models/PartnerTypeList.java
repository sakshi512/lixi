package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PartnerTypeList {
    GENERAL_PARTNER, LIMITED_PARTNER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GENERAL_PARTNER: return "General Partner";
            case LIMITED_PARTNER: return "Limited Partner";
        }
        return null;
    }

    @JsonCreator
    public static PartnerTypeList forValue(String value) throws IOException {
        if (value.equals("General Partner")) return GENERAL_PARTNER;
        if (value.equals("Limited Partner")) return LIMITED_PARTNER;
        throw new IOException("Cannot deserialize PartnerTypeList");
    }
}
