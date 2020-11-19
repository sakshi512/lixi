package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Percentage {
    private CalculationBasisList calculationBasis;
    private Double rate;
}
