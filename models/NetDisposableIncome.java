package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NetDisposableIncome {
    private Double amount;
    private FrequencyShortList frequency;
}
