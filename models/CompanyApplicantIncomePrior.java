package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantIncomePrior {
    private Double companyProfitAfterTax;
    private Double companyProfitBeforeTax;
    private String endDate;
    private YesNoList incomeGreaterThanPreviousYear;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private FluffyAddback addback;
}
