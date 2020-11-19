package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NonRealEstateAssetContractDetails {
    private String contractDate;
    private Double contractPriceAmount;
    private Double depositAmount;
    private Double depositPaid;
    private String estimatedSettlementDate;
    private Double gstAmount;
    private YesNoList gstInclusive;
    private YesNoList gstOverwritten;
    private Double inputTaxCredit;
    private Double insurancePremium;
    private Double luxuryCarTax;
    private Double netTradeIn;
    private Double nonClaimableGST;
    private Double onRoadCosts;
    private Double otherCost;
    private Double registrationCost;
    private Double stampDuty;
    private SupplierTypeList supplierType;
    private Double totalCost;
    private Double tradeInAmount;
    private Double tradeInExistingFinance;
    private String xVendor;
}
