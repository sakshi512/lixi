package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantSourceOfWealth {
    private String detail;
    private Double percentage;
    private SourceOfFundsTypeList type;
}
