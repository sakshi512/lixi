package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TotalUserStatedLivingExpenses {
    private Double amount;
    private FrequencyShortList frequency;
}
