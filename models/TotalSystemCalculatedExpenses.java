package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TotalSystemCalculatedExpenses {
    private Double amount;
    private FrequencyShortList frequency;
}
