package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FundsDisbursementType {
    private Double amount;
    private String companyName;
    private SurplusFundsDisbursementMethodList method;
    private String uniqueID;
    private String xAccount;
    private String xAddress;
    private FinancialAccountType accountNumber;
    private BillerDetails billerDetails;
    private String personName;
}
