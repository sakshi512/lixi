package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PersonApplicant {
    private ApplicantTypeList applicantType;
    private CountryCodeList citizenship;
    private YesNoList companyDirector;
    private CountryCodeList countryOfBirth;
    private CreditStatusList creditStatus;
    private String customerTypeCode;
    private String customerTypeDescription;
    private String dateOfBirth;
    private YesNoList discussedWithBeneficiaries;
    private YesNoList eligibleForFHOG;
    private YesNoList firstHomeBuyer;
    private YesNoList firstPropertyBuyer;
    private GenderList gender;
    private YesNoList hasAppliedForAustralianCitizenship;
    private YesNoList hasAppliedForPermanentResidencyVisa;
    private YesNoList hasAWill;
    private YesNoList hasPreviousName;
    private YesNoList immigrant;
    private String immigrationDate;
    private YesNoList independentFinancialAdvice;
    private YesNoList independentLegalAdvice;
    private YesNoList isExistingCustomer;
    private YesNoList isLenderStaff;
    private YesNoList jointNomination;
    private YesNoList jointStatementOfPosition;
    private MaritalStatusList maritalStatus;
    private Double monthsInCurrentProfession;
    private String mothersMaidenName;
    private String permanentResidencyDate;
    private String placeOfBirth;
    private YesNoList poaGranted;
    private YesNoList primaryApplicant;
    private CountryCodeList principalForeignResidence;
    private KinRelationshipList relationshipToPrimaryApplicant;
    private ResidencyStatusList residencyStatus;
    private String temporaryVisaExpiryDate;
    private YesNoList underDuress;
    private YesNoList understandApplication;
    private String uniqueID;
    private String visaSubclassCode;
    private String xAccountant;
    private String xHousehold;
    private String xPersonalReference;
    private String xSolicitor;
    private Double yearsInCurrentProfession;
    private PersonApplicantContact contact;
    private List<PersonApplicantCreditHistory> creditHistory;
    private DocumentationInstructions documentationInstructions;
    private List<Employment> employment;
    private PersonApplicantExistingCustomer existingCustomer;
    private List<FinancialSituationCheck> financialSituationCheck;
    private ForeignTaxAssociationType foreignTaxAssociation;
    private List<IdentityCheck> identityCheck;
    private List<PersonApplicantInsurance> insurance;
    private MaritalStatusDetails maritalStatusDetails;
    private NextOfKin nextOfKin;
    private NominatedBorrower nominatedBorrower;
    private PersonNameType personName;
    private PowerOfAttorney powerOfAttorney;
    private PreviousName previousName;
    private Privacy privacy;
    private List<ProofOfIdentity> proofOfIdentity;
    private ResponsibleLendingType responsibleLending;
    private List<SourceOfFund> sourceOfFunds;
    private List<PersonApplicantSourceOfWealth> sourceOfWealth;
    private TaxDeclarationDetailsType taxDeclarationDetails;
    private Will will;
}
