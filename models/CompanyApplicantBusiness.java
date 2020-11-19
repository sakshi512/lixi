package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantBusiness {
    private String australianBIC;
    private String customIndustryCode;
    private String franchiseDetails;
    private String gicsCode;
    private String industry;
    private AnzsicIndustryCodeList industryCode;
    private YesNoIntentList isAFranchise;
    private String mainBusinessActivity;
    private Long numberOfEmployees;
    private Long numberOfLocations;
    private YesNoList ownPremises;
    private String principalTradingAddressLeaseAgreementDetails;
    private YesNoList principalTradingAddressLeased;
    private String startDate;
    private ConcentrationRisk concentrationRisk;
    private Diversification diversification;
    private ImportExport importExport;
    private PropertyInvestment propertyInvestment;
}
