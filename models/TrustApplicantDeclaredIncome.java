package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantDeclaredIncome {
    private Double incomeAmount;
    private Double netIncomeAmount;
}
