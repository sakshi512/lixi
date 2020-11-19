package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RefinancingReason {
    private YesNoList closeToEndOfCurrentLoanTerm;
    private String closeToEndOfCurrentLoanTermDetails;
    private YesNoList debtConsolidation;
    private String debtConsolidationDetails;
    private YesNoList dissatisfactionWithCurrentLender;
    private String dissatisfactionWithCurrentLenderDetails;
    private YesNoList greaterFlexibility;
    private String greaterFlexibilityDetails;
    private YesNoList increaseTotalLoanAmount;
    private String increaseTotalLoanAmountDetails;
    private YesNoList lowerInterestRate;
    private String lowerInterestRateDetails;
    private YesNoList other;
    private String otherDetails;
    private YesNoList reducedRepayments;
    private String reducedRepaymentsDetails;
}
