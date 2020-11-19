package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantExistingCustomer {
    private String customerNumber;
    private String customerSince;
    private MmMonthList customerSinceMonth;
    private FinancialAccountType accountNumber;
}
