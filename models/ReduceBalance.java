package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ReduceBalance {
    private String actionDate;
    private Double newBalance;
    private Double reductionAmount;
}
