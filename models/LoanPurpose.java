package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanPurpose {
    private NccpStatusList nccpStatus;
    private OccupancyList occupancy;
    private YesNoList ownerBuilderApplication;
    private PrimaryPurposeLoanPurposeList primaryPurpose;
}
