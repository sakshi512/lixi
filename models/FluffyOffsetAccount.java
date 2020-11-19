package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffyOffsetAccount {
    private YesNoList isExisting;
    private String uniqueID;
    private String xAccount;
    private FinancialAccountType accountNumber;
}
