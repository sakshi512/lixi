package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailTermsAndCondition {
    private String termsCode;
    private String termsName;
}
