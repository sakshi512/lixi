package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailRateComposition {
    private Double customerRiskMargin;
    private YesNoList disclosedToCustomer;
    private Double introducerMargin;
    private Double introductoryMargin;
    private Double netCustomerRiskMargin;
    private Double originatorMargin;
    private Double paymentTypeMargin;
    private String pricingConstruct;
    private Double productMargin;
    private Double subsidyBaseAmount;
    private Double subsidyBasePercent;
    private Double subsidyRateSacrifice;
    private Double termPremium;
    private Double totalInterestRate;
    private String uniqueID;
    private FluffyBaseRate baseRate;
}
