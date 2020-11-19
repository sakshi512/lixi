package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailDiscountMargin {
    private Double discountedAmount;
    private Double discountRate;
    private String discountReason;
    private Long duration;
    private DurationUnitsList durationUnits;
}
