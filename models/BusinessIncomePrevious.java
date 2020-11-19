package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomePrevious {
    private String endDate;
    private YesNoList hasForeignSourcedIncome;
    private YesNoList incomeGreaterThanPreviousYear;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private BusinessIncomePreviousAddback addback;
    private BusinessIncomePreviousForeignSourcedIncome foreignSourcedIncome;
}
