package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class OriginalTerm {
    private String interestOnlyEndDate;
    private InterestTypeList interestType;
    private Long interestTypeDuration;
    private LoanTermUnitsList interestTypeUnits;
    private PaymentTypeList paymentType;
    private Long paymentTypeDuration;
    private LoanTermUnitsList paymentTypeUnits;
    private Long rolloverPeriodDuration;
    private LoanTermUnitsList rolloverPeriodUnits;
    private Long totalTermDuration;
    private LoanTermUnitsList totalTermUnits;
    private List<OriginalTermDistinctLoanPeriod> distinctLoanPeriod;
}
