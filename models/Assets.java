package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Assets {
    private Double cash;
    private Double cashAndCashEquivalents;
    private Double intangibles;
    private Double inventory;
    private Double tangibleAssets;
    private Double totalAssets;
    private Double totalCurrentAssets;
    private Double tradeDebtors;
}
