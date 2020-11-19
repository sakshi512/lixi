package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NonRealEstateSecurityPriorityList {
    FIRST_SECURITY_INTEREST, SECOND_SECURITY_INTEREST, THIRD_SECURITY_INTEREST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FIRST_SECURITY_INTEREST: return "First Security Interest";
            case SECOND_SECURITY_INTEREST: return "Second Security Interest";
            case THIRD_SECURITY_INTEREST: return "Third Security Interest";
        }
        return null;
    }

    @JsonCreator
    public static NonRealEstateSecurityPriorityList forValue(String value) throws IOException {
        if (value.equals("First Security Interest")) return FIRST_SECURITY_INTEREST;
        if (value.equals("Second Security Interest")) return SECOND_SECURITY_INTEREST;
        if (value.equals("Third Security Interest")) return THIRD_SECURITY_INTEREST;
        throw new IOException("Cannot deserialize NonRealEstateSecurityPriorityList");
    }
}
