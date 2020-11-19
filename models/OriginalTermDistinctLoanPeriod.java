package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class OriginalTermDistinctLoanPeriod {
    private String endDate;
    private InterestTypeList interestType;
    private PaymentTypeList paymentType;
    private Long sequenceNumber;
    private String startDate;
    private String uniqueID;
    private String xRateComposition;
    private DurationType duration;
    private List<PurpleRepayment> repayment;
}
