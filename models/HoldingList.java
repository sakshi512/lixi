package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HoldingList {
    COMPANY_SHARE, JOINT_TENANTS, SOLE, TENNANT_COMMON_IN_EQUAL_SHARES, TENNANT_COMMON_IN_SHARES_OF, TIME_SHARE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPANY_SHARE: return "Company Share";
            case JOINT_TENANTS: return "Joint Tenants";
            case SOLE: return "Sole";
            case TENNANT_COMMON_IN_EQUAL_SHARES: return "Tennant Common in Equal Shares";
            case TENNANT_COMMON_IN_SHARES_OF: return "Tennant Common in Shares of";
            case TIME_SHARE: return "Time Share";
        }
        return null;
    }

    @JsonCreator
    public static HoldingList forValue(String value) throws IOException {
        if (value.equals("Company Share")) return COMPANY_SHARE;
        if (value.equals("Joint Tenants")) return JOINT_TENANTS;
        if (value.equals("Sole")) return SOLE;
        if (value.equals("Tennant Common in Equal Shares")) return TENNANT_COMMON_IN_EQUAL_SHARES;
        if (value.equals("Tennant Common in Shares of")) return TENNANT_COMMON_IN_SHARES_OF;
        if (value.equals("Time Share")) return TIME_SHARE;
        throw new IOException("Cannot deserialize HoldingList");
    }
}
