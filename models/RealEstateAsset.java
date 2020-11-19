package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class RealEstateAsset {
    private YesNoList approvalInPrinciple;
    private YesNoList construction;
    private YesNoList contractOfSale;
    private DataSourceList dataSource;
    private YesNoList encumbered;
    private HoldingList holding;
    private YesNoList investmentPropertyLetter;
    private YesNoList legalRepresentation;
    private NrasConsortiumList nrasConsortium;
    private YesNoList nrasProperty;
    private OccupancyList occupancy;
    private YesNoList onMarketTransaction;
    private String primaryLandUse;
    private PrimaryPurposeRealEstateAssetList primaryPurpose;
    private YesNoList primarySecurity;
    private PrimaryUsageList primaryUsage;
    private String propertyID;
    private YesNoList purchaseUnderAOCWrap;
    private RealEstateAssetStatusList status;
    private YesNoList toBeSold;
    private YesNoList toBeUsedAsSecurity;
    private AssetTransactionList transaction;
    private String uniqueID;
    private ValuationProgramList valuationProgram;
    private YesNoList valuationRequired;
    private String xAddress;
    private String xPropertyAgent;
    private Commercial commercial;
    private ConstructionDetails constructionDetails;
    private RealEstateAssetContractDetails contractDetails;
    private List<RealEstateAssetEncumbrance> encumbrance;
    private RealEstateAssetEstimatedValue estimatedValue;
    private List<FundsDisbursementType> fundsDisbursement;
    private FutureRentalIncome futureRentalIncome;
    private HeritageListing heritageListing;
    private Industrial industrial;
    private List<RealEstateAssetInsurance> insurance;
    private PercentOwnedType percentOwned;
    private PropertyFeatures propertyFeatures;
    private PropertyType propertyType;
    private RentalIncome rentalIncome;
    private Representation representation;
    private Residential residential;
    private RestrictionOnUseOfLand restrictionOnUseOfLand;
    private Rural rural;
    private List<Title> title;
    private VisitContact visitContact;
    private Zoning zoning;
}
