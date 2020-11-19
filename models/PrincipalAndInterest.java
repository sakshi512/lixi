package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PrincipalAndInterest {
    private ImportanceList importance;
    private FrequencyShortList repaymentFrequency;
    private YesNoList risksExplained;
    private PrincipalAndInterestReason reason;
}
