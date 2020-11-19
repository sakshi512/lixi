package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleRecurringIncomeFromSuperannuationDetails {
    private YesNoList financialPlannerDocumentation;
    private String financialPlannerDocumentationDescription;
    private YesNoList superStatementShowingProjectedRecurringIncome;
    private String superStatementShowingProjectedRecurringIncomeDescription;
}
