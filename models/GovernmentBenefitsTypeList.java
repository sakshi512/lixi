package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GovernmentBenefitsTypeList {
    ABSTUDY, AGE_PENSION, AUSTUDY, CARER_PAYMENT, CHILD_SUPPORT, CRISIS_PAYMENT, DISABILITY_SUPPORT_PENSION, FAMILY_ALLOWANCE, MOBILITY_ALLOWANCE, OTHER, PARENTING_PAYMENT, WIDOWS_ALLOWANCE, YOUTH_ALLOWANCE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ABSTUDY: return "Abstudy";
            case AGE_PENSION: return "Age Pension";
            case AUSTUDY: return "Austudy";
            case CARER_PAYMENT: return "Carer Payment";
            case CHILD_SUPPORT: return "Child Support";
            case CRISIS_PAYMENT: return "Crisis Payment";
            case DISABILITY_SUPPORT_PENSION: return "Disability Support Pension";
            case FAMILY_ALLOWANCE: return "Family Allowance";
            case MOBILITY_ALLOWANCE: return "Mobility Allowance";
            case OTHER: return "Other";
            case PARENTING_PAYMENT: return "Parenting Payment";
            case WIDOWS_ALLOWANCE: return "Widows Allowance";
            case YOUTH_ALLOWANCE: return "Youth Allowance";
        }
        return null;
    }

    @JsonCreator
    public static GovernmentBenefitsTypeList forValue(String value) throws IOException {
        if (value.equals("Abstudy")) return ABSTUDY;
        if (value.equals("Age Pension")) return AGE_PENSION;
        if (value.equals("Austudy")) return AUSTUDY;
        if (value.equals("Carer Payment")) return CARER_PAYMENT;
        if (value.equals("Child Support")) return CHILD_SUPPORT;
        if (value.equals("Crisis Payment")) return CRISIS_PAYMENT;
        if (value.equals("Disability Support Pension")) return DISABILITY_SUPPORT_PENSION;
        if (value.equals("Family Allowance")) return FAMILY_ALLOWANCE;
        if (value.equals("Mobility Allowance")) return MOBILITY_ALLOWANCE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Parenting Payment")) return PARENTING_PAYMENT;
        if (value.equals("Widows Allowance")) return WIDOWS_ALLOWANCE;
        if (value.equals("Youth Allowance")) return YOUTH_ALLOWANCE;
        throw new IOException("Cannot deserialize GovernmentBenefitsTypeList");
    }
}
