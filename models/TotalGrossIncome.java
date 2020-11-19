package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TotalGrossIncome {
    private Double amount;
    private FrequencyShortList frequency;
}
