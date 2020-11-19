package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LoanTypeList {
    BRIDGING_FINANCE, CHATTEL_MORTGAGE, COMMERCIAL_BILL, COMMERCIAL_HIRE_PURCHASE, CREDIT_CARD, FINANCE_LEASE, LEASE, LINE_OF_CREDIT, MARGIN_LOAN, MORTGAGE_LOAN, OPERATING_LEASE, OTHER_LOAN, OVERDRAFT, PERSONAL_LOAN, REVERSE_MORTGAGE, TERM_LOAN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BRIDGING_FINANCE: return "Bridging Finance";
            case CHATTEL_MORTGAGE: return "Chattel Mortgage";
            case COMMERCIAL_BILL: return "Commercial Bill";
            case COMMERCIAL_HIRE_PURCHASE: return "Commercial Hire Purchase";
            case CREDIT_CARD: return "Credit Card";
            case FINANCE_LEASE: return "Finance Lease";
            case LEASE: return "Lease";
            case LINE_OF_CREDIT: return "Line of Credit";
            case MARGIN_LOAN: return "Margin Loan";
            case MORTGAGE_LOAN: return "Mortgage Loan";
            case OPERATING_LEASE: return "Operating Lease";
            case OTHER_LOAN: return "Other Loan";
            case OVERDRAFT: return "Overdraft";
            case PERSONAL_LOAN: return "Personal Loan";
            case REVERSE_MORTGAGE: return "Reverse Mortgage";
            case TERM_LOAN: return "Term Loan";
        }
        return null;
    }

    @JsonCreator
    public static LoanTypeList forValue(String value) throws IOException {
        if (value.equals("Bridging Finance")) return BRIDGING_FINANCE;
        if (value.equals("Chattel Mortgage")) return CHATTEL_MORTGAGE;
        if (value.equals("Commercial Bill")) return COMMERCIAL_BILL;
        if (value.equals("Commercial Hire Purchase")) return COMMERCIAL_HIRE_PURCHASE;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("Finance Lease")) return FINANCE_LEASE;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("Line of Credit")) return LINE_OF_CREDIT;
        if (value.equals("Margin Loan")) return MARGIN_LOAN;
        if (value.equals("Mortgage Loan")) return MORTGAGE_LOAN;
        if (value.equals("Operating Lease")) return OPERATING_LEASE;
        if (value.equals("Other Loan")) return OTHER_LOAN;
        if (value.equals("Overdraft")) return OVERDRAFT;
        if (value.equals("Personal Loan")) return PERSONAL_LOAN;
        if (value.equals("Reverse Mortgage")) return REVERSE_MORTGAGE;
        if (value.equals("Term Loan")) return TERM_LOAN;
        throw new IOException("Cannot deserialize LoanTypeList");
    }
}
