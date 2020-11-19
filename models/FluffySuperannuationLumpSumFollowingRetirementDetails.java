package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffySuperannuationLumpSumFollowingRetirementDetails {
    private YesNoList financialPlannerDocumentation;
    private String financialPlannerDocumentationDescription;
    private YesNoList superStatementShowingProjectedSuperannuationAmount;
    private String superStatementShowingProjectedSuperannuationAmountDescription;
}
