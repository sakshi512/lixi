package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LendingGuaranteeLimitIncrease {
    private Double increaseAmount;
    private Double newLimit;
}
