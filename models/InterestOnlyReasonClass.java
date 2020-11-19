package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestOnlyReasonClass {
    private YesNoList accommodateAnticipatedNonRecurringExpenseItem;
    private YesNoList accommodateTemporaryReductionInIncome;
    private YesNoList createFundsForInvestmentPurposes;
    private String description;
    private YesNoList maximiseCashFlow;
    private YesNoList minimiseCashFlowImpactDuringConstruction;
    private YesNoList minimiseCashFlowImpactDuringTheBridgingPeriod;
    private YesNoList other;
    private YesNoList planToConvertToInvestmentProperty;
    private YesNoList principalReductionsInAnOffsetFacility;
    private YesNoList recommendation;
    private YesNoList taxationOrAccountingReasons;
    private YesNoList variableAndUnpredictableIncome;
}
