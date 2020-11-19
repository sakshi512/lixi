package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LiabilityLendingPurpose {
    private String absLendingPurpose;
    private AbsLendingPurposeCodeList absLendingPurposeCode;
    private String description;
    private String lenderCode;
}
