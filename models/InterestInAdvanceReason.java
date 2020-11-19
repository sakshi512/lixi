package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestInAdvanceReason {
    private String description;
    private YesNoList discountsOnInterestRate;
    private YesNoList forTaxPurposes;
    private YesNoList other;
    private YesNoList toAssistWithCashFlowAndBudgeting;
}
