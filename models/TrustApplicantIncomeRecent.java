package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantIncomeRecent {
    private String endDate;
    private YesNoList incomeGreaterThanPreviousYear;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private ProofCodeList proofCode;
    private YesNoList proofSighted;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private HilariousAddback addback;
}
