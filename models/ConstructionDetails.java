package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ConstructionDetails {
    private BuilderTypeList builderType;
    private Double buildPriceAmount;
    private YesNoList constructionInsuranceHeld;
    private YesNoList copyBuildersLicenceHeld;
    private YesNoList copyHomeOwnersWarrantyCertificateHeld;
    private YesNoList councilApprovalHeld;
    private YesNoList detailedCostingsHeld;
    private String estimatedCompletionDate;
    private YesNoList fixedPriceContract;
    private Double initialAmount;
    private Double landValue;
    private LandValueEstimateBasisList landValueBasis;
    private YesNoList satisfactoryTOCValuationHeld;
    private YesNoList signedContract;
    private YesNoList tenPercentOfLendingAsCash;
    private Double totalAmount;
    private ConstructionTypeList type;
    private String xBuilder;
    private List<ConstructionStage> constructionStage;
    private OwnerBuilderExperience ownerBuilderExperience;
}
