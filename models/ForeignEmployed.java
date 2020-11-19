package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ForeignEmployed {
    private Double averageHoursPerWeek;
    private BasisList basis;
    private YesNoList companyCar;
    private String customIndustryCode;
    private String customOccupationCode;
    private EmployerTypeList employerType;
    private String endDate;
    private String gicsCode;
    private IncomeStatusOnOrBeforeSettlementList incomeStatusOnOrBeforeSettlement;
    private String industry;
    private String mainBusinessActivity;
    private String occupation;
    private YesNoList onProbation;
    private String positionTitle;
    private String probationDateEnds;
    private String probationDateStarts;
    private String startDate;
    private EmploymentStatusList status;
    private String uniqueID;
    private String xEmployer;
    private DurationType duration;
    private ForeignEmployedIncome income;
}
