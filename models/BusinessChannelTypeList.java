package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BusinessChannelTypeList {
    BANK, BUILDING_SOCIETY, CREDIT_UNION, MORTGAGE_MANAGER, MUTUAL_BANK, NON_BANK_LENDER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANK: return "Bank";
            case BUILDING_SOCIETY: return "Building Society";
            case CREDIT_UNION: return "Credit Union";
            case MORTGAGE_MANAGER: return "Mortgage Manager";
            case MUTUAL_BANK: return "Mutual Bank";
            case NON_BANK_LENDER: return "Non Bank Lender";
        }
        return null;
    }

    @JsonCreator
    public static BusinessChannelTypeList forValue(String value) throws IOException {
        if (value.equals("Bank")) return BANK;
        if (value.equals("Building Society")) return BUILDING_SOCIETY;
        if (value.equals("Credit Union")) return CREDIT_UNION;
        if (value.equals("Mortgage Manager")) return MORTGAGE_MANAGER;
        if (value.equals("Mutual Bank")) return MUTUAL_BANK;
        if (value.equals("Non Bank Lender")) return NON_BANK_LENDER;
        throw new IOException("Cannot deserialize BusinessChannelTypeList");
    }
}
