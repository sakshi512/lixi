package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OtherIncomeTypeList {
    ANNUITIES, CHILD_MAINTENANCE, DIVIDENDS, FOREIGN_SOURCED, GOVERNMENT_BENEFITS, INTEREST_INCOME, OTHER_INCOME, PRIVATE_PENSION, SALARY_SACRIFICE_CONTRIBUTION, SUPERANNUATION, SUPER_CONCESSIONAL_CONTRIBUTION, SUPER_EXCESS_CONCESSIONAL_CONTRIBUTION, SUPER_NON_CONCESSIONAL_CONTRIBUTION, WORKERS_COMPENSATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ANNUITIES: return "Annuities";
            case CHILD_MAINTENANCE: return "Child Maintenance";
            case DIVIDENDS: return "Dividends";
            case FOREIGN_SOURCED: return "Foreign Sourced";
            case GOVERNMENT_BENEFITS: return "Government Benefits";
            case INTEREST_INCOME: return "Interest Income";
            case OTHER_INCOME: return "Other Income";
            case PRIVATE_PENSION: return "Private Pension";
            case SALARY_SACRIFICE_CONTRIBUTION: return "Salary Sacrifice Contribution";
            case SUPERANNUATION: return "Superannuation";
            case SUPER_CONCESSIONAL_CONTRIBUTION: return "Super Concessional Contribution";
            case SUPER_EXCESS_CONCESSIONAL_CONTRIBUTION: return "Super Excess Concessional Contribution";
            case SUPER_NON_CONCESSIONAL_CONTRIBUTION: return "Super Non Concessional Contribution";
            case WORKERS_COMPENSATION: return "Workers Compensation";
        }
        return null;
    }

    @JsonCreator
    public static OtherIncomeTypeList forValue(String value) throws IOException {
        if (value.equals("Annuities")) return ANNUITIES;
        if (value.equals("Child Maintenance")) return CHILD_MAINTENANCE;
        if (value.equals("Dividends")) return DIVIDENDS;
        if (value.equals("Foreign Sourced")) return FOREIGN_SOURCED;
        if (value.equals("Government Benefits")) return GOVERNMENT_BENEFITS;
        if (value.equals("Interest Income")) return INTEREST_INCOME;
        if (value.equals("Other Income")) return OTHER_INCOME;
        if (value.equals("Private Pension")) return PRIVATE_PENSION;
        if (value.equals("Salary Sacrifice Contribution")) return SALARY_SACRIFICE_CONTRIBUTION;
        if (value.equals("Superannuation")) return SUPERANNUATION;
        if (value.equals("Super Concessional Contribution")) return SUPER_CONCESSIONAL_CONTRIBUTION;
        if (value.equals("Super Excess Concessional Contribution")) return SUPER_EXCESS_CONCESSIONAL_CONTRIBUTION;
        if (value.equals("Super Non Concessional Contribution")) return SUPER_NON_CONCESSIONAL_CONTRIBUTION;
        if (value.equals("Workers Compensation")) return WORKERS_COMPENSATION;
        throw new IOException("Cannot deserialize OtherIncomeTypeList");
    }
}
