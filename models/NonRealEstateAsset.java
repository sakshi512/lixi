package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class NonRealEstateAsset {
    private Double amountToBeReduced;
    private YesNoList contractOfSale;
    private YesNoList encumbered;
    private FinancialTransactionTypeList financialTransactionType;
    private YesNoList primarySecurity;
    private YesNoList toBeReduced;
    private YesNoList toBeSold;
    private YesNoList toBeUsedAsSecurity;
    private AssetTransactionList transaction;
    private NonRealEstateAssetTypeList type;
    private String uniqueID;
    private String xVendorTaxInvoice;
    private AgriculturalAsset agriculturalAsset;
    private Aircraft aircraft;
    private NonRealEstateAssetBusiness business;
    private CleaningEquipment cleaningEquipment;
    private NonRealEstateAssetContractDetails contractDetails;
    private EarthMovingMiningAndConstruction earthMovingMiningAndConstruction;
    private List<NonRealEstateAssetEncumbrance> encumbrance;
    private NonRealEstateAssetEstimatedValue estimatedValue;
    private FinancialAsset financialAsset;
    private List<FundsDisbursementType> fundsDisbursement;
    private HospitalityAndLeisure hospitalityAndLeisure;
    private List<NonRealEstateAssetInsurance> insurance;
    private ITAndAVEquipment itAndAVEquipment;
    private MaterialsHandlingAndLifting materialsHandlingAndLifting;
    private MedicalEquipment medicalEquipment;
    private MobileComputing mobileComputing;
    private MotorVehicle motorVehicle;
    private OfficeEquipment officeEquipment;
    private OtherAsset otherAsset;
    private PercentOwnedType percentOwned;
    private PlantEquipmentAndIndustrial plantEquipmentAndIndustrial;
    private Ppsr ppsr;
    private ToolsOfTrade toolsOfTrade;
}
