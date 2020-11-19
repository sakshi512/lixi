package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ServiceabilityResult {
    private Double dsr;
    private Double dti;
    private String groupIdentifier;
    private String groupName;
    private Double lti;
    private Double maximumLoanAmount;
    private Double maximumRepaymentAmount;
    private RepaymentFrequencyList maximumRepaymentFrequency;
    private Double mrim;
    private Double nsr;
    private YesNoList serviceable;
    private String uniqueID;
    private List<ServiceabilityResultApplicant> applicant;
    private NetDisposableIncome netDisposableIncome;
    private TotalGrossIncome totalGrossIncome;
    private TotalNetIncome totalNetIncome;
    private TotalSystemCalculatedExpenses totalSystemCalculatedExpenses;
    private TotalSystemCalculatedLivingExpenses totalSystemCalculatedLivingExpenses;
    private TotalUserStatedLivingExpenses totalUserStatedLivingExpenses;
}
