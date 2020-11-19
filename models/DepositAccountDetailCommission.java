package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DepositAccountDetailCommission {
    private Double commissionAmount;
    private YesNoList commissionPaid;
    private CommissionStructureList commissionStructure;
    private String otherCommissionStructureDescription;
    private String promotionCode;
    private YesNoList thirdPartyReferee;
    private Double trail;
}
