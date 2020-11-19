package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TotalNetIncome {
    private Double amount;
    private FrequencyShortList frequency;
}
