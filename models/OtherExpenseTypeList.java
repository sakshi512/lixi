package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OtherExpenseTypeList {
    ADDITIONAL_CAR_S_MAINTENANCE, ADDITIONAL_CAR_S_PETROL, ADDITIONAL_CAR_S_REGISTRATION, BOARD, BODY_CORPORATE_LEVIES, BUILDING_OR_CONTENTS_INSURANCE, CHILD_CARE, CHILD_MAINTENANCE, EDUCATION, GYM_MEMBERSHIP, MAINTENANCE_FEE, MEDICAL, MOBILE_PHONE_S, NON_GOVERNMENT_EDUCATION, OTHER, PRIVATE_HEALTH_MEDICAL, RENT, SUBSCRIPTIONS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADDITIONAL_CAR_S_MAINTENANCE: return "Additional Car(s) Maintenance";
            case ADDITIONAL_CAR_S_PETROL: return "Additional Car(s) Petrol";
            case ADDITIONAL_CAR_S_REGISTRATION: return "Additional Car(s) Registration";
            case BOARD: return "Board";
            case BODY_CORPORATE_LEVIES: return "Body Corporate Levies";
            case BUILDING_OR_CONTENTS_INSURANCE: return "Building or Contents Insurance";
            case CHILD_CARE: return "Child Care";
            case CHILD_MAINTENANCE: return "Child Maintenance";
            case EDUCATION: return "Education";
            case GYM_MEMBERSHIP: return "Gym Membership";
            case MAINTENANCE_FEE: return "Maintenance Fee";
            case MEDICAL: return "Medical";
            case MOBILE_PHONE_S: return "Mobile Phone(s)";
            case NON_GOVERNMENT_EDUCATION: return "Non Government Education";
            case OTHER: return "Other";
            case PRIVATE_HEALTH_MEDICAL: return "Private Health / Medical";
            case RENT: return "Rent";
            case SUBSCRIPTIONS: return "Subscriptions";
        }
        return null;
    }

    @JsonCreator
    public static OtherExpenseTypeList forValue(String value) throws IOException {
        if (value.equals("Additional Car(s) Maintenance")) return ADDITIONAL_CAR_S_MAINTENANCE;
        if (value.equals("Additional Car(s) Petrol")) return ADDITIONAL_CAR_S_PETROL;
        if (value.equals("Additional Car(s) Registration")) return ADDITIONAL_CAR_S_REGISTRATION;
        if (value.equals("Board")) return BOARD;
        if (value.equals("Body Corporate Levies")) return BODY_CORPORATE_LEVIES;
        if (value.equals("Building or Contents Insurance")) return BUILDING_OR_CONTENTS_INSURANCE;
        if (value.equals("Child Care")) return CHILD_CARE;
        if (value.equals("Child Maintenance")) return CHILD_MAINTENANCE;
        if (value.equals("Education")) return EDUCATION;
        if (value.equals("Gym Membership")) return GYM_MEMBERSHIP;
        if (value.equals("Maintenance Fee")) return MAINTENANCE_FEE;
        if (value.equals("Medical")) return MEDICAL;
        if (value.equals("Mobile Phone(s)")) return MOBILE_PHONE_S;
        if (value.equals("Non Government Education")) return NON_GOVERNMENT_EDUCATION;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Private Health / Medical")) return PRIVATE_HEALTH_MEDICAL;
        if (value.equals("Rent")) return RENT;
        if (value.equals("Subscriptions")) return SUBSCRIPTIONS;
        throw new IOException("Cannot deserialize OtherExpenseTypeList");
    }
}
