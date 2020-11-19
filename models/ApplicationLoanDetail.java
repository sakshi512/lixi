package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ApplicationLoanDetail {
    private Double amountRequested;
    private Double balloonRepaymentAmount;
    private String balloonRepaymentDate;
    private YesNoList considerLowerLimitIfNotEligible;
    private String estimatedSettlementDate;
    private FunderList funder;
    private InterestChargeFrequencyList interestCalculationFrequency;
    private InterestChargeFrequencyList interestChargeFrequency;
    private LoanTypeList loanType;
    private YesNoList mainProduct;
    private String maturityDate;
    private Double minimumRepaymentRate;
    private YesNoList negativelyGeared;
    private YesNoList nominateBalloonRepayment;
    private String originatorReferenceID;
    private String productCode;
    private String productName;
    private Double proposedAnnualInterestRate;
    private YesNoList secured;
    private YesNoList smsfLoan;
    private String specialConcessionCode;
    private StatementCycleList statementCycle;
    private YesNoList taxDeductible;
    private String templateID;
    private String uniqueID;
    private String xMasterAgreement;
    private PercentOwnedType borrowers;
    private BulkReduction bulkReduction;
    private LoanDetailCommission commission;
    private LoanDetailDiscountMargin discountMargin;
    private DocumentationInstructionsType documentationInstructions;
    private LoanDetailDSH dsh;
    private EquityRelease equityRelease;
    private LoanDetailFeaturesSelected featuresSelected;
    private List<FundsDisbursementType> fundsDisbursement;
    private List<LoanDetailGuarantor> guarantor;
    private List<LoanDetailLendingPurpose> lendingPurpose;
    private LoanPurpose loanPurpose;
    private LoanDetailPackage loanDetailPackage;
    private ProposedRepayment proposedRepayment;
    private List<LoanDetailRateComposition> rateComposition;
    private List<LoanDetailSecurity> security;
    private LoanDetailSoftware software;
    private StatementInstructions statementInstructions;
    private List<LoanDetailSupplementaryCardholder> supplementaryCardholder;
    private Term term;
    private List<LoanDetailTermsAndCondition> termsAndConditions;
}
