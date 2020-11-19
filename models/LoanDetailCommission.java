package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailCommission {
    private Double commissionAmount;
    private YesNoList commissionPaid;
    private CommissionStructureList commissionStructure;
    private Double gstAmount;
    private Double itcAmount;
    private String otherCommissionStructureDescription;
    private String promotionCode;
    private YesNoList thirdPartyReferee;
    private Double trail;
    private Double upfrontPayment;
}
