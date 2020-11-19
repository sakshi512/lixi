package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BalanceIncrease {
    private String actionDate;
    private Double increaseAmount;
    private Double newBalance;
}
