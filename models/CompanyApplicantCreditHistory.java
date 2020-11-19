package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantCreditHistory {
    private String details;
    private YesNoList isCurrent;
    private CreditHistoryIssueList issue;
    private String uniqueID;
}
