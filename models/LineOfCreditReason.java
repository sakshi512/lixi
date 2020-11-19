package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LineOfCreditReason {
    private YesNoList allowsAccessToFundsAtAnyTime;
    private YesNoList anticipatedVariableCashFlows;
    private YesNoList assistsWithInvestmentPurchasesAndTaxPlanning;
    private String description;
    private YesNoList flexibilityToManageRepayments;
    private YesNoList noNeedToApplyForFurtherLendingInFuture;
    private YesNoList ongoingNeedForFunds;
    private YesNoList other;
}
