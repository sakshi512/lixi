package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomePriorForeignSourcedIncome {
    private Double audAmount;
    private CurrencyCodeList primaryForeignCurrency;
}
