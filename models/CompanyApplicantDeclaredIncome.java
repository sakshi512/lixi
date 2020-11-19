package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantDeclaredIncome {
    private Double incomeAmount;
    private Double netIncomeAmount;
}
