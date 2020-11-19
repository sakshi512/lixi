package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class VariableRateReason {
    private String description;
    private YesNoList flexibility;
    private YesNoList other;
    private YesNoList potentialRateDecreases;
}
