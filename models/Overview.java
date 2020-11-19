package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Overview {
    private ApplicationTypeList applicationType;
    private String brokerApplicationReferenceNumber;
    private Long brokerApplicationSequenceNumber;
    private YesNoList combinationLoan;
    private ApplicationDocTypeList docType;
    private String expectedSettlementDate;
    private YesNoList fastRefinance;
    private YesNoList isBridgingFinance;
    private String lenderApplicationReferenceNumber;
    private String lenderPreapprovalReferenceNumber;
    private YesNoList linkedCommercialApplication;
    private String lodgementReferenceNumber;
    private Long lodgementSequenceNumber;
    private YesNoList proPack;
    private YesNoList smsfLoan;
    private String xMainContactPoint;
    private OverviewBranchDomicile branchDomicile;
    private BranchSign branchSign;
    private BridgingFinance bridgingFinance;
    private List<SignatureType> signature;
}
