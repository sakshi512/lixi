package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LiabilityTypeList {
    BRIDGING_FINANCE, CAR_LOAN, COMMERCIAL_BILL, CONTINGENT_LIABILITY, CREDIT_CARD, HECS_HELP, HIRE_PURCHASE, LEASE, LINE_OF_CREDIT, LOAN_AS_GUARANTOR, MARGIN_LOAN, MORTGAGE_LOAN, OTHER, OTHER_LOAN, OUTSTANDING_TAXATION, OVERDRAFT, PERSONAL_LOAN, STORE_CARD, TERM_LOAN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BRIDGING_FINANCE: return "Bridging Finance";
            case CAR_LOAN: return "Car Loan";
            case COMMERCIAL_BILL: return "Commercial Bill";
            case CONTINGENT_LIABILITY: return "Contingent Liability";
            case CREDIT_CARD: return "Credit Card";
            case HECS_HELP: return "HECS-HELP";
            case HIRE_PURCHASE: return "Hire Purchase";
            case LEASE: return "Lease";
            case LINE_OF_CREDIT: return "Line of Credit";
            case LOAN_AS_GUARANTOR: return "Loan as Guarantor";
            case MARGIN_LOAN: return "Margin Loan";
            case MORTGAGE_LOAN: return "Mortgage Loan";
            case OTHER: return "Other";
            case OTHER_LOAN: return "Other Loan";
            case OUTSTANDING_TAXATION: return "Outstanding Taxation";
            case OVERDRAFT: return "Overdraft";
            case PERSONAL_LOAN: return "Personal Loan";
            case STORE_CARD: return "Store Card";
            case TERM_LOAN: return "Term Loan";
        }
        return null;
    }

    @JsonCreator
    public static LiabilityTypeList forValue(String value) throws IOException {
        if (value.equals("Bridging Finance")) return BRIDGING_FINANCE;
        if (value.equals("Car Loan")) return CAR_LOAN;
        if (value.equals("Commercial Bill")) return COMMERCIAL_BILL;
        if (value.equals("Contingent Liability")) return CONTINGENT_LIABILITY;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("HECS-HELP")) return HECS_HELP;
        if (value.equals("Hire Purchase")) return HIRE_PURCHASE;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("Line of Credit")) return LINE_OF_CREDIT;
        if (value.equals("Loan as Guarantor")) return LOAN_AS_GUARANTOR;
        if (value.equals("Margin Loan")) return MARGIN_LOAN;
        if (value.equals("Mortgage Loan")) return MORTGAGE_LOAN;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Other Loan")) return OTHER_LOAN;
        if (value.equals("Outstanding Taxation")) return OUTSTANDING_TAXATION;
        if (value.equals("Overdraft")) return OVERDRAFT;
        if (value.equals("Personal Loan")) return PERSONAL_LOAN;
        if (value.equals("Store Card")) return STORE_CARD;
        if (value.equals("Term Loan")) return TERM_LOAN;
        throw new IOException("Cannot deserialize LiabilityTypeList");
    }
}
