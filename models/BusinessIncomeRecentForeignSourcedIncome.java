package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomeRecentForeignSourcedIncome {
    private Double audAmount;
    private CurrencyCodeList primaryForeignCurrency;
}
