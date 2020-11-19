package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TotalSystemCalculatedLivingExpenses {
    private Double amount;
    private FrequencyShortList frequency;
}
