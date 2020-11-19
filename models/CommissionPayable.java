package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CommissionPayable {
    private Double amount;
    private Double percentage;
    private String xPayer;
}
