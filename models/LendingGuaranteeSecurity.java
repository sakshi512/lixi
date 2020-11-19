package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LendingGuaranteeSecurity {
    private SecurityPriorityList priority;
    private String uniqueID;
    private String xSecurity;
    private SecurityAgreementType securityAgreement;
}
