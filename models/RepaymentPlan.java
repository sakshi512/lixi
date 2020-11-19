package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RepaymentPlan {
    private YesNoList coApplicantIncome;
    private String description;
    private YesNoList downsizing;
    private YesNoList incomeFromOtherInvestments;
    private YesNoList other;
    private YesNoList repaymentOfLoanPriorToEndOfTerm;
    private YesNoList saleOfAssets;
    private YesNoList savings;
}
