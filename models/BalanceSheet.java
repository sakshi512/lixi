package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BalanceSheet {
    private Double equity;
    private Double netAssets;
    private Double paidUpCapital;
    private Double retainedEarnings;
    private Double shareholderFunds;
    private Assets assets;
    private Liabilities liabilities;
}
