package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherIncome {
    private Double amount;
    private String benefitsDescription;
    private CountryCodeList country;
    private String description;
    private String endDate;
    private FrequencyShortList frequency;
    private GovernmentBenefitsTypeList governmentBenefitsType;
    private IncomeStatusOnOrBeforeSettlementList incomeStatusOnOrBeforeSettlement;
    private IncomeVerificationList incomeVerification;
    private YesNoList isTaxable;
    private Double netAmount;
    private FrequencyShortList netAmountFrequency;
    private Double previousYearAmount;
    private CurrencyCodeList primaryForeignCurrency;
    private ProofCodeOtherList proofCode;
    private YesNoList proofSighted;
    private String startDate;
    private YesNoList taxed;
    private OtherIncomeTypeList type;
    private String uniqueID;
    private PercentOwnedType percentOwned;
}
