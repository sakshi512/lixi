package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailLendingPurpose {
    private String absLendingPurpose;
    private AbsLendingPurposeCodeList absLendingPurposeCode;
    private String description;
    private YesNoList includesRefinancing;
    private String lenderCode;
    private YesNoList payoutQuoteObtained;
    private Double purposeAmount;
    private PrincipalRefinancingReasonList refinancingReason;
    private YesNoList securityForMarginLoan;
    private String uniqueID;
}
