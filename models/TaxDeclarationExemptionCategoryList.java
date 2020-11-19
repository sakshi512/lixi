package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TaxDeclarationExemptionCategoryList {
    AGE_PENSION, CARER_PAYMENT, CHILD_EXEMPTION, DISABILITY_SUPPORT_PENSION, NON_RESIDENT_EXEMPTION, NOT_REQUIRED_FOR_INTEREST_INCOME, NOT_REQUIRED_TO_LODGE_A_TAX_RETURN, PARENTING_PAYMENT_SINGLE, SPECIAL_BENEFIT, SPECIAL_NEEDS_PENSION, VETERAN_ALLOWANCE, VETERAN_PENSION, WIDOW_B_PENSION, WIFE_PENSION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AGE_PENSION: return "Age Pension";
            case CARER_PAYMENT: return "Carer Payment";
            case CHILD_EXEMPTION: return "Child Exemption";
            case DISABILITY_SUPPORT_PENSION: return "Disability Support Pension";
            case NON_RESIDENT_EXEMPTION: return "Non-Resident Exemption";
            case NOT_REQUIRED_FOR_INTEREST_INCOME: return "Not Required for Interest Income";
            case NOT_REQUIRED_TO_LODGE_A_TAX_RETURN: return "Not Required to Lodge a Tax Return";
            case PARENTING_PAYMENT_SINGLE: return "Parenting Payment Single";
            case SPECIAL_BENEFIT: return "Special Benefit";
            case SPECIAL_NEEDS_PENSION: return "Special Needs Pension";
            case VETERAN_ALLOWANCE: return "Veteran Allowance";
            case VETERAN_PENSION: return "Veteran Pension";
            case WIDOW_B_PENSION: return "Widow B Pension";
            case WIFE_PENSION: return "Wife Pension";
        }
        return null;
    }

    @JsonCreator
    public static TaxDeclarationExemptionCategoryList forValue(String value) throws IOException {
        if (value.equals("Age Pension")) return AGE_PENSION;
        if (value.equals("Carer Payment")) return CARER_PAYMENT;
        if (value.equals("Child Exemption")) return CHILD_EXEMPTION;
        if (value.equals("Disability Support Pension")) return DISABILITY_SUPPORT_PENSION;
        if (value.equals("Non-Resident Exemption")) return NON_RESIDENT_EXEMPTION;
        if (value.equals("Not Required for Interest Income")) return NOT_REQUIRED_FOR_INTEREST_INCOME;
        if (value.equals("Not Required to Lodge a Tax Return")) return NOT_REQUIRED_TO_LODGE_A_TAX_RETURN;
        if (value.equals("Parenting Payment Single")) return PARENTING_PAYMENT_SINGLE;
        if (value.equals("Special Benefit")) return SPECIAL_BENEFIT;
        if (value.equals("Special Needs Pension")) return SPECIAL_NEEDS_PENSION;
        if (value.equals("Veteran Allowance")) return VETERAN_ALLOWANCE;
        if (value.equals("Veteran Pension")) return VETERAN_PENSION;
        if (value.equals("Widow B Pension")) return WIDOW_B_PENSION;
        if (value.equals("Wife Pension")) return WIFE_PENSION;
        throw new IOException("Cannot deserialize TaxDeclarationExemptionCategoryList");
    }
}
