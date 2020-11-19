package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomeYearToDateForeignSourcedIncome {
    private Double audAmount;
    private CurrencyCodeList primaryForeignCurrency;
}
