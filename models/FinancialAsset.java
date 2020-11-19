package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FinancialAsset {
    private String description;
    private YesNoList transferOwnershipToSMSF;
    private FinancialAssetTypeList type;
    private FinancialAccountType accountNumber;
    private Shares shares;
}
