package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PayFeesFromList {
    ACCOUNT, ADD_TO_LOAN_AMOUNT, CASH, CHEQUE, CREDIT_CARD, DEBIT_CARD, DIRECT_CREDIT, DIRECT_DEPOSIT, FROM_SETTLEMENT_PROCEEDS, INCLUDED_IN_LOAN_AMOUNT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNT: return "Account";
            case ADD_TO_LOAN_AMOUNT: return "Add to Loan Amount";
            case CASH: return "Cash";
            case CHEQUE: return "Cheque";
            case CREDIT_CARD: return "Credit Card";
            case DEBIT_CARD: return "Debit Card";
            case DIRECT_CREDIT: return "Direct Credit";
            case DIRECT_DEPOSIT: return "Direct Deposit";
            case FROM_SETTLEMENT_PROCEEDS: return "From Settlement Proceeds";
            case INCLUDED_IN_LOAN_AMOUNT: return "Included in Loan Amount";
        }
        return null;
    }

    @JsonCreator
    public static PayFeesFromList forValue(String value) throws IOException {
        if (value.equals("Account")) return ACCOUNT;
        if (value.equals("Add to Loan Amount")) return ADD_TO_LOAN_AMOUNT;
        if (value.equals("Cash")) return CASH;
        if (value.equals("Cheque")) return CHEQUE;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("Debit Card")) return DEBIT_CARD;
        if (value.equals("Direct Credit")) return DIRECT_CREDIT;
        if (value.equals("Direct Deposit")) return DIRECT_DEPOSIT;
        if (value.equals("From Settlement Proceeds")) return FROM_SETTLEMENT_PROCEEDS;
        if (value.equals("Included in Loan Amount")) return INCLUDED_IN_LOAN_AMOUNT;
        throw new IOException("Cannot deserialize PayFeesFromList");
    }
}
