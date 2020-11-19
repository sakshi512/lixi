package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InsuranceTypeList {
    BODY_CORPORATE, BUILDING_INSURANCE, BUILDING_REPLACEMENT, CONSUMER_CREDIT_INSURANCE, DISABLEMENT, HOME_CONTENTS_INSURANCE, INCOME_PROTECTION, INVOLUNTARY_UNEMPLOYMENT, LIFE_INSURANCE, LMI, OTHER, TRAUMA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BODY_CORPORATE: return "Body Corporate";
            case BUILDING_INSURANCE: return "Building Insurance";
            case BUILDING_REPLACEMENT: return "Building Replacement";
            case CONSUMER_CREDIT_INSURANCE: return "Consumer Credit Insurance";
            case DISABLEMENT: return "Disablement";
            case HOME_CONTENTS_INSURANCE: return "Home Contents Insurance";
            case INCOME_PROTECTION: return "Income Protection";
            case INVOLUNTARY_UNEMPLOYMENT: return "Involuntary Unemployment";
            case LIFE_INSURANCE: return "Life Insurance";
            case LMI: return "LMI";
            case OTHER: return "Other";
            case TRAUMA: return "Trauma";
        }
        return null;
    }

    @JsonCreator
    public static InsuranceTypeList forValue(String value) throws IOException {
        if (value.equals("Body Corporate")) return BODY_CORPORATE;
        if (value.equals("Building Insurance")) return BUILDING_INSURANCE;
        if (value.equals("Building Replacement")) return BUILDING_REPLACEMENT;
        if (value.equals("Consumer Credit Insurance")) return CONSUMER_CREDIT_INSURANCE;
        if (value.equals("Disablement")) return DISABLEMENT;
        if (value.equals("Home Contents Insurance")) return HOME_CONTENTS_INSURANCE;
        if (value.equals("Income Protection")) return INCOME_PROTECTION;
        if (value.equals("Involuntary Unemployment")) return INVOLUNTARY_UNEMPLOYMENT;
        if (value.equals("Life Insurance")) return LIFE_INSURANCE;
        if (value.equals("LMI")) return LMI;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Trauma")) return TRAUMA;
        throw new IOException("Cannot deserialize InsuranceTypeList");
    }
}
