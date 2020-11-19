package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Application {
    private YesNoList productionData;
    private String uniqueID;
    private List<AccountVariation> accountVariation;
    private List<AddressType> address;
    private BusinessChannel businessChannel;
    private List<CompanyApplicant> companyApplicant;
    private List<ApplicationCompanyFinancial> companyFinancials;
    private List<ContributionFund> contributionFunds;
    private List<CustomerTransactionAnalysis> customerTransactionAnalysis;
    private Declarations declarations;
    private List<DepositAccountDetail> depositAccountDetails;
    private List<DetailedComment> detailedComment;
    private List<Household> household;
    private List<ApplicationInsurance> insurance;
    private List<LendingGuarantee> lendingGuarantee;
    private List<ApplicationLiability> liability;
    private List<ApplicationLoanDetail> loanDetails;
    private List<MasterAgreement> masterAgreement;
    private List<NonRealEstateAsset> nonRealEstateAsset;
    private List<OtherExpense> otherExpense;
    private List<OtherIncome> otherIncome;
    private Overview overview;
    private List<PersonApplicant> personApplicant;
    private List<ProductPackage> productPackage;
    private List<ProductSet> productSet;
    private List<RealEstateAsset> realEstateAsset;
    private List<RelatedCompany> relatedCompany;
    private List<RelatedPerson> relatedPerson;
    private SalesChannel salesChannel;
    private List<Settlement> settlement;
    private List<SplitLoan> splitLoan;
    private Summary summary;
    private List<TrustApplicant> trustApplicant;
    private List<VendorTaxInvoiceType> vendorTaxInvoice;
}
