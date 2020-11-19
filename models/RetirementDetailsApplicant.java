package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RetirementDetailsApplicant {
    private Long ageAtEndOfLoan;
    private Long intendedRetirementAge;
    private String name;
    private String number;
    private YesNoList understandsImpactOnRetirementPlans;
    private String xApplicant;
    private ApplicantRepaymentOptions repaymentOptions;
}
