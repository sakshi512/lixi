package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FundsAccessTypeDetailsOffsetAccount {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private OffsetAccountReason reason;
}
