package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CompanyApplicant {
    private String abn;
    private YesNoList abnVerified;
    private String acn;
    private YesNoList allowDirectMarketing;
    private YesNoList allowThirdPartyDisclosure;
    private ApplicantTypeList applicantType;
    private String arbn;
    private String arsn;
    private String businessName;
    private YesNoList businessNameSameAsCompanyName;
    private BusinessStructureExcludingTrustList businessStructure;
    private String companyName;
    private CreditStatusList creditStatus;
    private String customerTypeCode;
    private String customerTypeDescription;
    private String dateRegistered;
    private String exchangeListedOn;
    private ExemptStatusList exemptStatus;
    private String gstRegisteredDate;
    private YesNoList isExistingCustomer;
    private YesNoList isHoldingCompany;
    private String licenceNumber;
    private Long numberOfDirectors;
    private Long numberOfPartners;
    private Long numberOfShareholders;
    private OecdCRSStatusList oecdcrsStatus;
    private YesNoList primaryApplicant;
    private YesNoList publicAuthority;
    private String reasonForObtainingLoan;
    private YesNoList registeredForGST;
    private CountryCodeList registeredInCountry;
    private AuStateList registeredInState;
    private YesNoList tradingMoreThanTwoYears;
    private TypeOfIncorporationList typeOfIncorporation;
    private String uniqueID;
    private String xAccountant;
    private String xSoleTrader;
    private String xSolicitor;
    private String xTradeReference;
    private List<AuthorisedSignatory> authorisedSignatory;
    private List<CompanyApplicantBeneficialOwner> beneficialOwner;
    private CompanyApplicantBusiness business;
    private CompanyApplicantContact contact;
    private List<CompanyApplicantCreditHistory> creditHistory;
    private CompanyApplicantDeclaredIncome declaredIncome;
    private List<Director> director;
    private CompanyApplicantExistingCustomer existingCustomer;
    private CompanyApplicantFinancialAnalysis financialAnalysis;
    private ForeignTaxAssociationType foreignTaxAssociation;
    private CompanyApplicantIncomePrevious incomePrevious;
    private CompanyApplicantIncomePrior incomePrior;
    private CompanyApplicantIncomeRecent incomeRecent;
    private CompanyApplicantIncomeYearToDate incomeYearToDate;
    private List<CompanyApplicantPartner> partner;
    private RelatedLegalEntities relatedLegalEntities;
    private ResponsibleLendingType responsibleLending;
    private List<Shareholder> shareholder;
    private List<CompanyApplicantSourceOfWealth> sourceOfWealth;
}
