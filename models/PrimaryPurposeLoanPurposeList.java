package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PrimaryPurposeLoanPurposeList {
    BUSINESS, INVESTMENT_NON_RESIDENTIAL, INVESTMENT_RESIDENTIAL, OWNER_OCCUPIED, PERSONAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BUSINESS: return "Business";
            case INVESTMENT_NON_RESIDENTIAL: return "Investment Non Residential";
            case INVESTMENT_RESIDENTIAL: return "Investment Residential";
            case OWNER_OCCUPIED: return "Owner Occupied";
            case PERSONAL: return "Personal";
        }
        return null;
    }

    @JsonCreator
    public static PrimaryPurposeLoanPurposeList forValue(String value) throws IOException {
        if (value.equals("Business")) return BUSINESS;
        if (value.equals("Investment Non Residential")) return INVESTMENT_NON_RESIDENTIAL;
        if (value.equals("Investment Residential")) return INVESTMENT_RESIDENTIAL;
        if (value.equals("Owner Occupied")) return OWNER_OCCUPIED;
        if (value.equals("Personal")) return PERSONAL;
        throw new IOException("Cannot deserialize PrimaryPurposeLoanPurposeList");
    }
}
