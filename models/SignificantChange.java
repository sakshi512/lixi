package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SignificantChange {
    private SignificantChangeList change;
    private String description;
    private String endDate;
    private Double monthlyFinancialImpact;
    private String startDate;
    private String uniqueID;
}
