package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SelfEmployed {
    private AnzscoOccupationCodeList anzscoOccupationCode;
    private Double averageHoursPerWeek;
    private SelfEmployedBasisList basis;
    private String endDate;
    private IncomeStatusOnOrBeforeSettlementList incomeStatusOnOrBeforeSettlement;
    private String occupation;
    private AbsOccupationCodeList occupationCode;
    private String startDate;
    private EmploymentStatusList status;
    private String uniqueID;
    private String xAccountant;
    private String xEmployer;
    private SelfEmployedBusiness business;
    private BusinessIncomePrevious businessIncomePrevious;
    private BusinessIncomePrior businessIncomePrior;
    private BusinessIncomeRecent businessIncomeRecent;
    private BusinessIncomeYearToDate businessIncomeYearToDate;
    private SelfEmployedDeclaredIncome declaredIncome;
    private DurationType duration;
    private SelfEmployedFinancialAnalysis financialAnalysis;
}
