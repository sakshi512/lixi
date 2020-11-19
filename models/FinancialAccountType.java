package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FinancialAccountType {
    private String accountName;
    private String accountNumber;
    private String accountTypeName;
    private String bsb;
    private FinancialInstitutionList financialInstitution;
    private String otherFIName;
    private AccountNumberBranchDomicile branchDomicile;
}
