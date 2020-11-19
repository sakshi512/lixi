package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BrokerDeclarations {
    private YesNoList interestOnlyMeetsRequirements;
    private String interestOnlyMeetsRequirementsDescription;
    private YesNoList interestOnlyRisksExplained;
    private String interestOnlyRisksExplainedDescription;
}
