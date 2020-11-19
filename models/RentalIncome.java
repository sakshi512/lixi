package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class RentalIncome {
    private YesNoList evidenceOfTenancy;
    private FrequencyFullList frequency;
    private IncomeStatusOnOrBeforeSettlementList incomeStatusOnOrBeforeSettlement;
    private Double netRentalAmount;
    private FrequencyShortList netRentalAmountFrequency;
    private Double rentalAmount;
    private List<RentalIncomePropertyPart> propertyPart;
}
