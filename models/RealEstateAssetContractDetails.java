package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RealEstateAssetContractDetails {
    private YesNoList armsLengthTransaction;
    private String contractDate;
    private Double contractPriceAmount;
    private Double depositAmount;
    private Double depositPaid;
    private Double depositPercentageRequested;
    private String estimatedSettlementDate;
    private String financeApprovalDate;
    private YesNoList licencedRealEstateAgentContract;
    private Double transferOfLandAmount;
    private String xVendor;
}
