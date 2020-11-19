package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PrincipalAndInterestReason {
    private YesNoList buildUpEquityFromTheStart;
    private String description;
    private YesNoList higherLendingLimit;
    private YesNoList lowerDepositRequired;
    private YesNoList minimiseInterestPaidOverLifeOfLoan;
    private YesNoList other;
}
