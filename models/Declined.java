package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Declined {
    private CreditReportingBodyList creditReportingBody;
    private String details;
    private DeclinedReasonApplicationInstructionsList reason;
    private String uniqueID;
}
