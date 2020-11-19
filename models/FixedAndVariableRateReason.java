package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FixedAndVariableRateReason {
    private String description;
    private YesNoList flexibility;
    private YesNoList limitingRateIncreaseRisk;
    private YesNoList makeBudgetingEasier;
    private YesNoList other;
}
