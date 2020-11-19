package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NotEmployed {
    private String endDate;
    private YesNoList homeDuties;
    private IncomeStatusOnOrBeforeSettlementList incomeStatusOnOrBeforeSettlement;
    private YesNoList onBenefits;
    private YesNoList retired;
    private String startDate;
    private EmploymentStatusList status;
    private YesNoList student;
    private String uniqueID;
    private DurationType duration;
    private NotEmployedIncome income;
}
