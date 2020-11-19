package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LendingGuaranteeLimitDecrease {
    private Double decreaseAmount;
    private Double newLimit;
}
