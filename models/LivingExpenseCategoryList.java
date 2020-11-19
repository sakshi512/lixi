package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LivingExpenseCategoryList {
    CHILDCARE, CLOTHING_AND_PERSONAL_CARE, EDUCATION, GROCERIES, INSURANCE, INVESTMENT_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS, MEDICAL_AND_HEALTH, OTHER, OWNER_OCCUPIED_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS, RECREATION_AND_ENTERTAINMENT, TELEPHONE_INTERNET_PAY_TV_AND_MEDIA_STREAMING_SUBSCRIPTIONS, TRANSPORT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHILDCARE: return "Childcare";
            case CLOTHING_AND_PERSONAL_CARE: return "Clothing and personal care";
            case EDUCATION: return "Education";
            case GROCERIES: return "Groceries";
            case INSURANCE: return "Insurance";
            case INVESTMENT_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS: return "Investment property utilities, rates and related costs";
            case MEDICAL_AND_HEALTH: return "Medical and health";
            case OTHER: return "Other";
            case OWNER_OCCUPIED_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS: return "Owner occupied property utilities, rates and related costs";
            case RECREATION_AND_ENTERTAINMENT: return "Recreation and entertainment";
            case TELEPHONE_INTERNET_PAY_TV_AND_MEDIA_STREAMING_SUBSCRIPTIONS: return "Telephone, internet, pay TV and media streaming subscriptions";
            case TRANSPORT: return "Transport";
        }
        return null;
    }

    @JsonCreator
    public static LivingExpenseCategoryList forValue(String value) throws IOException {
        if (value.equals("Childcare")) return CHILDCARE;
        if (value.equals("Clothing and personal care")) return CLOTHING_AND_PERSONAL_CARE;
        if (value.equals("Education")) return EDUCATION;
        if (value.equals("Groceries")) return GROCERIES;
        if (value.equals("Insurance")) return INSURANCE;
        if (value.equals("Investment property utilities, rates and related costs")) return INVESTMENT_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS;
        if (value.equals("Medical and health")) return MEDICAL_AND_HEALTH;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Owner occupied property utilities, rates and related costs")) return OWNER_OCCUPIED_PROPERTY_UTILITIES_RATES_AND_RELATED_COSTS;
        if (value.equals("Recreation and entertainment")) return RECREATION_AND_ENTERTAINMENT;
        if (value.equals("Telephone, internet, pay TV and media streaming subscriptions")) return TELEPHONE_INTERNET_PAY_TV_AND_MEDIA_STREAMING_SUBSCRIPTIONS;
        if (value.equals("Transport")) return TRANSPORT;
        throw new IOException("Cannot deserialize LivingExpenseCategoryList");
    }
}
