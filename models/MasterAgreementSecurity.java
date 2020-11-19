package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MasterAgreementSecurity {
    private SecurityPriorityList priority;
    private String uniqueID;
    private String xSecurity;
    private PercentOwnedType percentOwned;
    private SecurityAgreementType securityAgreement;
}
