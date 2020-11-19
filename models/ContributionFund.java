package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ContributionFund {
    private Double amount;
    private String description;
    private YesNoList loan;
    private ContributionFundsTypeList type;
    private String uniqueID;
    private String xAssociatedLoanAccount;
    private String xFundsHeldInAccount;
}
