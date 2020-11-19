package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OffsetAccountReason {
    private YesNoList allowsAccessToFunds;
    private YesNoList allowsPayingOffLoanSooner;
    private String description;
    private YesNoList forTaxPurposes;
    private YesNoList other;
}
