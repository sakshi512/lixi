package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BridgingFinance {
    private Long bridgingTerm;
    private Double capitalisedInterestAmount;
    private YesNoList capitaliseInterest;
    private Double endDebt;
    private Double estimatedSellingCosts;
    private Double peakDebt;
}
