package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantIncomeYearToDate {
    private String endDate;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private String startDate;
    private AmbitiousAddback addback;
}
