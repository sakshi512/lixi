package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomeRecent {
    private String endDate;
    private YesNoList hasForeignSourcedIncome;
    private YesNoList incomeGreaterThanPreviousYear;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private ProofCodeSelfEmployedList proofCode;
    private YesNoList proofSighted;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private BusinessIncomeRecentAddback addback;
    private BusinessIncomeRecentForeignSourcedIncome foreignSourcedIncome;
}
