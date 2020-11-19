package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Fee {
    private Double amount;
    private YesNoList capitaliseFee;
    private FeeCategoryList category;
    private String description;
    private String feeCode;
    private FrequencyFullList frequency;
    private Double gstAmount;
    private YesNoList isDisclosed;
    private YesNoList isEstimated;
    private Double itcAmount;
    private Long numberOfRepeats;
    private YesNoList paid;
    private String payableTo;
    private PayFeesFromList payFeesFrom;
    private FeePaymentTimingList paymentTiming;
    private String startDate;
    private FeeTypeList type;
    private String uniqueID;
    private String xAccount;
    private String xFinancialProduct;
    private String xProductSet;
    private String xSecurity;
    private FinancialAccountType accountNumber;
    private DurationType applicableDuration;
    private FeeCreditCard creditCard;
    private FinancialAccountType payableToAccount;
    private Percentage percentage;
}
