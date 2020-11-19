package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FixedRate {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private DurationType fixedPeriodDuration;
    private FixedRateReason reason;
}
