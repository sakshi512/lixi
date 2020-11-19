package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RefinancingAndConsolidation {
    private String detailsOfCreditCardPlan;
    private YesNoList explainedIncreaseInterestRisk;
    private YesNoList explainedIncreaseLoanTermRisk;
    private YesNoList planToCloseOrReduceCreditCard;
    private RefinancingReason refinancingReason;
}
