package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LineOfCredit {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private LineOfCreditReason reason;
    private RepaymentPlan repaymentPlan;
}
