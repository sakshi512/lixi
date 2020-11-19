package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ReduceLimit {
    private Double limitReduction;
    private Double newLimit;
}
