package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SelfEmployedDeclaredIncome {
    private Double incomeAmount;
    private Double netIncomeAmount;
}
