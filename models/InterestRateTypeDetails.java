package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestRateTypeDetails {
    private FixedAndVariableRate fixedAndVariableRate;
    private FixedRate fixedRate;
    private VariableRate variableRate;
}
