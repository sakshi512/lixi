package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ApplicationTypeList {
    DEPOSIT_ACCOUNT, FACILITY_DRAWDOWN, LEASE, LOAN, LOAN_VARIATION, OVERDRAFT, PREQUALIFICATION, UNSECURED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEPOSIT_ACCOUNT: return "Deposit Account";
            case FACILITY_DRAWDOWN: return "Facility Drawdown";
            case LEASE: return "Lease";
            case LOAN: return "Loan";
            case LOAN_VARIATION: return "Loan Variation";
            case OVERDRAFT: return "Overdraft";
            case PREQUALIFICATION: return "Prequalification";
            case UNSECURED: return "Unsecured";
        }
        return null;
    }

    @JsonCreator
    public static ApplicationTypeList forValue(String value) throws IOException {
        if (value.equals("Deposit Account")) return DEPOSIT_ACCOUNT;
        if (value.equals("Facility Drawdown")) return FACILITY_DRAWDOWN;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("Loan")) return LOAN;
        if (value.equals("Loan Variation")) return LOAN_VARIATION;
        if (value.equals("Overdraft")) return OVERDRAFT;
        if (value.equals("Prequalification")) return PREQUALIFICATION;
        if (value.equals("Unsecured")) return UNSECURED;
        throw new IOException("Cannot deserialize ApplicationTypeList");
    }
}
