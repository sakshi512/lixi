package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InterestOnlyReasonList {
    CREATE_FUNDS_FOR_INVESTMENT_PURPOSES, LARGE_NON_RECURRING_EXPENSES, MAXIMISE_CASH_FLOW, MINIMISE_CASH_FLOW_IMPACT_DURING_CONSTRUCTION, MINIMISE_CASH_FLOW_IMPACT_DURING_THE_BRIDGING_PERIOD, OTHER_REASON, PLAN_TO_CONVERT_TO_INVESTMENT_PROPERTY, PRINCIPAL_REDUCTIONS_IN_AN_OFFSET_FACILITY, RECOMMENDATION_FROM_INDEPENDENT_FINANCIAL_ADVISER, TAXATION_FINANCIAL_OR_ACCOUNTING_REASONS, TEMPORARY_REDUCTION_IN_INCOME, VARIABLE_INCOME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CREATE_FUNDS_FOR_INVESTMENT_PURPOSES: return "Create funds for investment purposes";
            case LARGE_NON_RECURRING_EXPENSES: return "Large non-recurring expenses";
            case MAXIMISE_CASH_FLOW: return "Maximise cash flow";
            case MINIMISE_CASH_FLOW_IMPACT_DURING_CONSTRUCTION: return "Minimise Cash Flow Impact During Construction";
            case MINIMISE_CASH_FLOW_IMPACT_DURING_THE_BRIDGING_PERIOD: return "Minimise Cash Flow Impact During the Bridging Period";
            case OTHER_REASON: return "Other reason";
            case PLAN_TO_CONVERT_TO_INVESTMENT_PROPERTY: return "Plan to convert to investment property";
            case PRINCIPAL_REDUCTIONS_IN_AN_OFFSET_FACILITY: return "Principal reductions in an offset facility";
            case RECOMMENDATION_FROM_INDEPENDENT_FINANCIAL_ADVISER: return "Recommendation From Independent Financial Adviser";
            case TAXATION_FINANCIAL_OR_ACCOUNTING_REASONS: return "Taxation, financial or accounting reasons";
            case TEMPORARY_REDUCTION_IN_INCOME: return "Temporary reduction in income";
            case VARIABLE_INCOME: return "Variable income";
        }
        return null;
    }

    @JsonCreator
    public static InterestOnlyReasonList forValue(String value) throws IOException {
        if (value.equals("Create funds for investment purposes")) return CREATE_FUNDS_FOR_INVESTMENT_PURPOSES;
        if (value.equals("Large non-recurring expenses")) return LARGE_NON_RECURRING_EXPENSES;
        if (value.equals("Maximise cash flow")) return MAXIMISE_CASH_FLOW;
        if (value.equals("Minimise Cash Flow Impact During Construction")) return MINIMISE_CASH_FLOW_IMPACT_DURING_CONSTRUCTION;
        if (value.equals("Minimise Cash Flow Impact During the Bridging Period")) return MINIMISE_CASH_FLOW_IMPACT_DURING_THE_BRIDGING_PERIOD;
        if (value.equals("Other reason")) return OTHER_REASON;
        if (value.equals("Plan to convert to investment property")) return PLAN_TO_CONVERT_TO_INVESTMENT_PROPERTY;
        if (value.equals("Principal reductions in an offset facility")) return PRINCIPAL_REDUCTIONS_IN_AN_OFFSET_FACILITY;
        if (value.equals("Recommendation From Independent Financial Adviser")) return RECOMMENDATION_FROM_INDEPENDENT_FINANCIAL_ADVISER;
        if (value.equals("Taxation, financial or accounting reasons")) return TAXATION_FINANCIAL_OR_ACCOUNTING_REASONS;
        if (value.equals("Temporary reduction in income")) return TEMPORARY_REDUCTION_IN_INCOME;
        if (value.equals("Variable income")) return VARIABLE_INCOME;
        throw new IOException("Cannot deserialize InterestOnlyReasonList");
    }
}
