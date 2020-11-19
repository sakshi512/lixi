package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class VariableRate {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private VariableRateReason reason;
}
