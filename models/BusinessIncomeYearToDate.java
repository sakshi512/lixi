package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomeYearToDate {
    private String endDate;
    private YesNoList hasForeignSourcedIncome;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private String startDate;
    private BusinessIncomeYearToDateAddback addback;
    private BusinessIncomeYearToDateForeignSourcedIncome foreignSourcedIncome;
}
