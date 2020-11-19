package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LimitIncrease {
    private String actionDate;
    private Double increaseAmount;
    private Double newLimit;
}
