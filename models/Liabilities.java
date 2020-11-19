package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Liabilities {
    private Double debtAtNominalValue;
    private Double totalCurrentLiabilities;
    private Double totalLiabilities;
    private Double tradeCreditors;
}
