package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RetirementDetailsRepaymentOptions {
    private YesNoList coApplicantIncome;
    private String description;
    private YesNoList downsizingHome;
    private YesNoList incomeFromOtherInvestments;
    private YesNoList other;
    private YesNoList recurringIncomeFromSuperannuation;
    private YesNoList repaymentOfLoanPriorToRetirement;
    private YesNoList saleOfAssets;
    private YesNoList savings;
    private YesNoList superannuationLumpSumFollowingRetirement;
    private YesNoList workPastStatutoryRetirementAge;
    private FluffyRecurringIncomeFromSuperannuationDetails recurringIncomeFromSuperannuationDetails;
    private FluffySaleOfAssetsDetails saleOfAssetsDetails;
    private FluffySavingsDetails savingsDetails;
    private FluffySuperannuationLumpSumFollowingRetirementDetails superannuationLumpSumFollowingRetirementDetails;
}
