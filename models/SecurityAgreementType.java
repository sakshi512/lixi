package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SecurityAgreementType {
    private YesNoList held;
    private YesNoList toBeDischarged;
    private String type;
}
