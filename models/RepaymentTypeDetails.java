package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RepaymentTypeDetails {
    private InterestInAdvance interestInAdvance;
    private InterestOnly interestOnly;
    private LineOfCredit lineOfCredit;
    private PrincipalAndInterest principalAndInterest;
}
