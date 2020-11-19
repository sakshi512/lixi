package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantIncomeYearToDate {
    private Double companyProfitAfterTax;
    private Double companyProfitBeforeTax;
    private String endDate;
    private String startDate;
    private StickyAddback addback;
}
