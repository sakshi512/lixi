package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantIncomePrevious {
    private String endDate;
    private YesNoList incomeGreaterThanPreviousYear;
    private Double profitAfterTax;
    private Double profitBeforeTax;
    private String startDate;
    private YesNoList taxOfficeAssessments;
    private String xAccountant;
    private IndigoAddback addback;
}
