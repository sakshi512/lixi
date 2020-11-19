package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LiabilityRateComposition {
    private Double customerRiskMargin;
    private YesNoList disclosedToCustomer;
    private Double introductoryMargin;
    private Double netCustomerRiskMargin;
    private Double paymentTypeMargin;
    private String pricingConstruct;
    private Double productMargin;
    private Double termPremium;
    private Double totalInterestRate;
    private String uniqueID;
    private PurpleBaseRate baseRate;
}
