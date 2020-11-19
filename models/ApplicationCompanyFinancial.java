package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ApplicationCompanyFinancial {
    private String endDate;
    private String startDate;
    private String uniqueID;
    private BalanceSheet balanceSheet;
    private CurrentMarketData currentMarketData;
    private ProfitAndLoss profitAndLoss;
}
