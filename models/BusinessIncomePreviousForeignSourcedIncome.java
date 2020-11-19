package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessIncomePreviousForeignSourcedIncome {
    private Double audAmount;
    private CurrencyCodeList primaryForeignCurrency;
}
