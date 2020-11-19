package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffyRecurringIncomeFromSuperannuationDetails {
    private YesNoList financialPlannerDocumentation;
    private String financialPlannerDocumentationDescription;
    private YesNoList superStatementShowingProjectedRecurringIncome;
    private String superStatementShowingProjectedRecurringIncomeDescription;
}
