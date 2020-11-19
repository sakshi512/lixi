package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Preferences {
    private String conflictDescription;
    private YesNoList conflictExists;
    private FundsAccessTypeList fundsAccessType;
    private InterestRateTypeList interestRateType;
    private String otherPreferences;
    private YesNoList preferredLenders;
    private String preferredLendersDetails;
    private String prioritiesAndReasons;
    private PaymentTypeList repaymentType;
    private String summary;
    private FundsAccessTypeDetails fundsAccessTypeDetails;
    private InterestRateTypeDetails interestRateTypeDetails;
    private RepaymentTypeDetails repaymentTypeDetails;
}
