package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class MasterAgreement {
    private String dateOfExecution;
    private String description;
    private String endDate;
    private String lenderAgreementNumber;
    private Double masterFacilityLimit;
    private String productCode;
    private String productName;
    private MasterAgreementStatusList status;
    private String uniqueID;
    private List<AccountToIncorporate> accountToIncorporate;
    private PercentOwnedType percentOwned;
    private List<MasterAgreementSecurity> security;
}
