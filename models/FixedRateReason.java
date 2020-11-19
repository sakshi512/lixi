package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FixedRateReason {
    private YesNoList avoidingRateIncreaseRisk;
    private String description;
    private YesNoList makeBudgetingEasier;
    private YesNoList other;
}
