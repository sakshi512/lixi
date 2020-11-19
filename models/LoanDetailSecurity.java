package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailSecurity {
    private SecurityPriorityList priority;
    private String uniqueID;
    private String xSecurity;
    private SecurityAgreementType securityAgreement;
}
