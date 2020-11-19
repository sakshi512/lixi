package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantExistingCustomer {
    private String customerNumber;
    private String customerSince;
    private MmMonthList customerSinceMonth;
    private FinancialAccountType accountNumber;
}
