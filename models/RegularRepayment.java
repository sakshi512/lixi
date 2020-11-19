package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RegularRepayment {
    private Double amount;
    private String dayOfMonth;
    private DayOfWeekList dayOfWeek;
    private YesNoList endOfPeriod;
    private FrequencyFullList frequency;
    private Long frequencyInterval;
    private Double gstAmount;
    private YesNoList interestPayment;
    private LoanPaymentScheduleTypeList loanPaymentScheduleType;
    private Double minimumAmount;
    private YesNoList principalPayment;
    private Double stampDutyAmount;
    private Long totalRepayments;
    private String uniqueID;
    private WeekList week;
}
