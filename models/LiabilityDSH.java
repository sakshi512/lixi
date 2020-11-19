package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LiabilityDSH {
    private String assignmentCertificate;
    private String entitlementCertificate;
    private String fileNumber;
    private YesNoList subsidised;
    private YesNoList supplement;
}
