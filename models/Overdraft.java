package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Overdraft {
    private YesNoList considerLowerOverdraftLimitIfNotEligible;
    private YesNoList isOverdraftUsedForTemporaryExpenses;
    private Double limit;
    private String optionCode;
    private YesNoList overdraftRequested;
}
