package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FixedAndVariableRate {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private DurationType fixedPeriodDuration;
    private FixedAndVariableRateReason reason;
}
