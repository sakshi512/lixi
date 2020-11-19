package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SourceOfInitialDeposit {
    private String details;
    private Double percentage;
    private SourceOfFundsTypeList type;
}
