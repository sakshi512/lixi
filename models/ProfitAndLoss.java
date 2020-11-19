package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ProfitAndLoss {
    private Double amortisationExpense;
    private Double costOfGoodsSold;
    private Double depreciationExpense;
    private Double ebit;
    private Double ebitda;
    private Double grossProfit;
    private Double incomeTax;
    private Double interestExpense;
    private Double netProfitBeforeTax;
    private Double paymentsToDirectors;
    private Double sales;
    private Double totalExpenses;
}
