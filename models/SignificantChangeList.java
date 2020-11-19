package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SignificantChangeList {
    ANTICIPATED_LARGE_EXPENDITURE, END_OF_CONTRACT_OR_LOSS_OF_EMPLOYMENT, EXTENDED_UNPAID_LEAVE, INCREASED_DEBT_REPAYMENTS_FOR_AN_EXISTING_LOAN, LEAVING_EMPLOYMENT, MEDICAL_TREATMENT_OR_ILLNESS, OTHER, PERMANENT_DECREASE_IN_INCOME, PERMANENT_INCREASE_IN_EXPENSE, TEMPORARY_DECREASE_IN_INCOME, TEMPORARY_INCREASE_IN_EXPENSE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ANTICIPATED_LARGE_EXPENDITURE: return "Anticipated Large Expenditure";
            case END_OF_CONTRACT_OR_LOSS_OF_EMPLOYMENT: return "End of Contract or Loss of Employment";
            case EXTENDED_UNPAID_LEAVE: return "Extended Unpaid Leave";
            case INCREASED_DEBT_REPAYMENTS_FOR_AN_EXISTING_LOAN: return "Increased Debt Repayments for an Existing Loan";
            case LEAVING_EMPLOYMENT: return "Leaving Employment";
            case MEDICAL_TREATMENT_OR_ILLNESS: return "Medical Treatment or Illness";
            case OTHER: return "Other";
            case PERMANENT_DECREASE_IN_INCOME: return "Permanent Decrease in Income";
            case PERMANENT_INCREASE_IN_EXPENSE: return "Permanent Increase in Expense";
            case TEMPORARY_DECREASE_IN_INCOME: return "Temporary Decrease in Income";
            case TEMPORARY_INCREASE_IN_EXPENSE: return "Temporary Increase in Expense";
        }
        return null;
    }

    @JsonCreator
    public static SignificantChangeList forValue(String value) throws IOException {
        if (value.equals("Anticipated Large Expenditure")) return ANTICIPATED_LARGE_EXPENDITURE;
        if (value.equals("End of Contract or Loss of Employment")) return END_OF_CONTRACT_OR_LOSS_OF_EMPLOYMENT;
        if (value.equals("Extended Unpaid Leave")) return EXTENDED_UNPAID_LEAVE;
        if (value.equals("Increased Debt Repayments for an Existing Loan")) return INCREASED_DEBT_REPAYMENTS_FOR_AN_EXISTING_LOAN;
        if (value.equals("Leaving Employment")) return LEAVING_EMPLOYMENT;
        if (value.equals("Medical Treatment or Illness")) return MEDICAL_TREATMENT_OR_ILLNESS;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Permanent Decrease in Income")) return PERMANENT_DECREASE_IN_INCOME;
        if (value.equals("Permanent Increase in Expense")) return PERMANENT_INCREASE_IN_EXPENSE;
        if (value.equals("Temporary Decrease in Income")) return TEMPORARY_DECREASE_IN_INCOME;
        if (value.equals("Temporary Increase in Expense")) return TEMPORARY_INCREASE_IN_EXPENSE;
        throw new IOException("Cannot deserialize SignificantChangeList");
    }
}
