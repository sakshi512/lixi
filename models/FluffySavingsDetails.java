package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffySavingsDetails {
    private YesNoList lenderHeldSavingsAccount;
    private String lenderHeldSavingsAccountDescription;
    private YesNoList otherLenderHeldSavingsAccount;
    private String otherLenderHeldSavingsAccountDescription;
}
