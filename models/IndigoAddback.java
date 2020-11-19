package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class IndigoAddback {
    private Double allowances;
    private Double amortisationOfGoodwill;
    private Double bonus;
    private Double carryForwardLosses;
    private Double depreciation;
    private Double interest;
    private Double lease;
    private Double nonCashBenefits;
    private Double nonRecurringExpenses;
    private Double paymentToTrustee;
    private Double salary;
    private Double superannuationExcess;
    private List<CunningOtherAddback> otherAddback;
}
