package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleSuperannuationLumpSumFollowingRetirementDetails {
    private YesNoList financialPlannerDocumentation;
    private String financialPlannerDocumentationDescription;
    private YesNoList superStatementShowingProjectedSuperannuationAmount;
    private String superStatementShowingProjectedSuperannuationAmountDescription;
}
