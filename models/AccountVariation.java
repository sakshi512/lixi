package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AccountVariation {
    private VariationTypeList type;
    private String uniqueID;
    private String xAccountToVary;
    private String xLendingGuaranteeToVary;
    private String xPostVariationAccount;
    private AddBorrower addBorrower;
    private AddGuarantee addGuarantee;
    private AddGuaranteeSecurity addGuaranteeSecurity;
    private AddGuarantor addGuarantor;
    private AddSecurity addSecurity;
    private BalanceIncrease balanceIncrease;
    private ChangeLoanTerm changeLoanTerm;
    private ChangeRepaymentAmount changeRepaymentAmount;
    private ChangeRepaymentFrequency changeRepaymentFrequency;
    private ChangeRepaymentType changeRepaymentType;
    private CloseAccount closeAccount;
    private InterestRateDiscount interestRateDiscount;
    private LendingGuaranteeLimitDecrease lendingGuaranteeLimitDecrease;
    private LendingGuaranteeLimitIncrease lendingGuaranteeLimitIncrease;
    private LimitIncrease limitIncrease;
    private ReduceBalance reduceBalance;
    private ReduceLimit reduceLimit;
    private ReleaseGuarantee releaseGuarantee;
    private ReleaseGuaranteeSecurity releaseGuaranteeSecurity;
    private ReleaseGuarantor releaseGuarantor;
    private ReleaseSecurity releaseSecurity;
    private RemoveBorrower removeBorrower;
    private SplitAccount splitAccount;
    private SwitchProduct switchProduct;
    private UpdatePartyDetails updatePartyDetails;
}
