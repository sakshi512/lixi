package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ApplicationInsurance {
    private String description;
    private String effectiveDate;
    private String expiryDate;
    private InsuranceTypeList insuranceType;
    private Double insuredAmount;
    private InsurerList insurer;
    private String otherInsurerName;
    private String policyNumber;
    private String uniqueID;
    private List<InsuranceAssociatedLoanAccount> associatedLoanAccount;
    private CommissionPayable commissionPayable;
    private List<InsuredParty> insuredParty;
    private Premium premium;
}
