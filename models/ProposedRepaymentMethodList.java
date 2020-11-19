package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProposedRepaymentMethodList {
    AUSTRALIA_POST, BPAY, CREDIT_CARD, DIRECT_DEBIT_EXISTING_ACCOUNT, DIRECT_DEBIT_NEW_ACCOUNT, DIRECT_SALARY_CREDIT, FUNDS_TRANSFER, LENDER_BRANCH, OTHER, STAFF_PAY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUSTRALIA_POST: return "Australia Post";
            case BPAY: return "Bpay";
            case CREDIT_CARD: return "Credit Card";
            case DIRECT_DEBIT_EXISTING_ACCOUNT: return "Direct Debit Existing Account";
            case DIRECT_DEBIT_NEW_ACCOUNT: return "Direct Debit New Account";
            case DIRECT_SALARY_CREDIT: return "Direct Salary Credit";
            case FUNDS_TRANSFER: return "Funds Transfer";
            case LENDER_BRANCH: return "Lender Branch";
            case OTHER: return "Other";
            case STAFF_PAY: return "Staff Pay";
        }
        return null;
    }

    @JsonCreator
    public static ProposedRepaymentMethodList forValue(String value) throws IOException {
        if (value.equals("Australia Post")) return AUSTRALIA_POST;
        if (value.equals("Bpay")) return BPAY;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("Direct Debit Existing Account")) return DIRECT_DEBIT_EXISTING_ACCOUNT;
        if (value.equals("Direct Debit New Account")) return DIRECT_DEBIT_NEW_ACCOUNT;
        if (value.equals("Direct Salary Credit")) return DIRECT_SALARY_CREDIT;
        if (value.equals("Funds Transfer")) return FUNDS_TRANSFER;
        if (value.equals("Lender Branch")) return LENDER_BRANCH;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Staff Pay")) return STAFF_PAY;
        throw new IOException("Cannot deserialize ProposedRepaymentMethodList");
    }
}
