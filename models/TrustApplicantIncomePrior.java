package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantIncomePrior {
    private String endDate;
    private YesNoList incomeGreaterThanPreviousYear;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private IndecentAddback addback;
}
