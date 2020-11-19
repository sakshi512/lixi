package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FinancialAssetTypeList {
    CASH, INVESTMENT, MANAGED_FUNDS, OTHER, PENSION_ACCOUNT, RECEIVABLES, SAVINGS_ACCOUNT, SHARES_AND_DEBENTURES, SUPERANNUATION, TERM_DEPOSIT, TRANSACTION_ACCOUNT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASH: return "Cash";
            case INVESTMENT: return "Investment";
            case MANAGED_FUNDS: return "Managed Funds";
            case OTHER: return "Other";
            case PENSION_ACCOUNT: return "Pension Account";
            case RECEIVABLES: return "Receivables";
            case SAVINGS_ACCOUNT: return "Savings Account";
            case SHARES_AND_DEBENTURES: return "Shares and Debentures";
            case SUPERANNUATION: return "Superannuation";
            case TERM_DEPOSIT: return "Term Deposit";
            case TRANSACTION_ACCOUNT: return "Transaction Account";
        }
        return null;
    }

    @JsonCreator
    public static FinancialAssetTypeList forValue(String value) throws IOException {
        if (value.equals("Cash")) return CASH;
        if (value.equals("Investment")) return INVESTMENT;
        if (value.equals("Managed Funds")) return MANAGED_FUNDS;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Pension Account")) return PENSION_ACCOUNT;
        if (value.equals("Receivables")) return RECEIVABLES;
        if (value.equals("Savings Account")) return SAVINGS_ACCOUNT;
        if (value.equals("Shares and Debentures")) return SHARES_AND_DEBENTURES;
        if (value.equals("Superannuation")) return SUPERANNUATION;
        if (value.equals("Term Deposit")) return TERM_DEPOSIT;
        if (value.equals("Transaction Account")) return TRANSACTION_ACCOUNT;
        throw new IOException("Cannot deserialize FinancialAssetTypeList");
    }
}
