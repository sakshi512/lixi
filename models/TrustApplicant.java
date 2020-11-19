package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class TrustApplicant {
    private String abn;
    private ApplicantTypeList applicantType;
    private String businessName;
    private YesNoList businessNameSameAsTrustName;
    private CountryCodeList countryEstablished;
    private String customerTypeCode;
    private String customerTypeDescription;
    private String documentationType;
    private YesNoList established;
    private String establishmentDate;
    private YesNoList isExistingCustomer;
    private Long numberOfBeneficiaries;
    private Long numberOfTrustees;
    private OecdCRSStatusList oecdcrsStatus;
    private YesNoList primaryApplicant;
    private String settlorName;
    private String trustName;
    private TrustPurposeList trustPurpose;
    private TrustStructureList trustStructure;
    private String uniqueID;
    private String vestingDate;
    private String xAccountant;
    private List<TrustApplicantBeneficialOwner> beneficialOwner;
    private List<Beneficiary> beneficiary;
    private TrustApplicantBusiness business;
    private TrustApplicantContact contact;
    private List<DealingNumberType> dealingNumber;
    private TrustApplicantDeclaredIncome declaredIncome;
    private TrustApplicantExistingCustomer existingCustomer;
    private TrustApplicantFinancialAnalysis financialAnalysis;
    private ForeignTaxAssociationType foreignTaxAssociation;
    private TrustApplicantIncomePrevious incomePrevious;
    private TrustApplicantIncomePrior incomePrior;
    private TrustApplicantIncomeRecent incomeRecent;
    private TrustApplicantIncomeYearToDate incomeYearToDate;
    private List<Settlor> settlor;
    private List<TrustApplicantSourceOfWealth> sourceOfWealth;
    private List<TrustDeedVariation> trustDeedVariation;
    private List<Trustee> trustee;
}
