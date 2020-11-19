package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Premium {
    private Double amount;
    private FrequencyShortList frequency;
}
