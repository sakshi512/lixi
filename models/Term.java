package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Term {
    private InterestTypeList interestType;
    private Long interestTypeDuration;
    private LoanTermUnitsList interestTypeUnits;
    private PaymentTypeList paymentType;
    private Long paymentTypeDuration;
    private LoanTermUnitsList paymentTypeUnits;
    private Long rolloverPeriodDuration;
    private LoanTermUnitsList rolloverPeriodUnits;
    private Long totalTermDuration;
    private TotalTermTypeList totalTermType;
    private LoanTermUnitsList totalTermUnits;
    private List<TermDistinctLoanPeriod> distinctLoanPeriod;
    private List<InterestOnlyReason> interestOnlyReason;
}
