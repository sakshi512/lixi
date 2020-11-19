package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailDSH {
    private String assignmentCertificate;
    private String entitlementCertificate;
    private String fileNumber;
    private YesNoList subsidised;
    private YesNoList supplement;
}
