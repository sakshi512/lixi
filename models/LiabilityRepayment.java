package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LiabilityRepayment {
    private YesNoList interestPayment;
    private LoanPaymentScheduleTypeList loanPaymentScheduleType;
    private Double minimumAmount;
    private PaymentTimingList paymentTiming;
    private PaymentTypeList paymentType;
    private YesNoList principalPayment;
    private YesNoList regular;
    private Long remainingRepayments;
    private Double repaymentAmount;
    private RepaymentFrequencyList repaymentFrequency;
    private YesNoList taxDeductible;
    private String uniqueID;
}
