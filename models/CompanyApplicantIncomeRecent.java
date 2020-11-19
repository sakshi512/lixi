package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantIncomeRecent {
    private Double companyProfitAfterTax;
    private Double companyProfitBeforeTax;
    private String endDate;
    private YesNoList incomeGreaterThanPreviousYear;
    private ProofCodeList proofCode;
    private YesNoList proofSighted;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private TentacledAddback addback;
}
