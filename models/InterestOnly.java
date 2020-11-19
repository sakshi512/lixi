package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestOnly {
    private ImportanceList importance;
    private String interestOnlyDurationReason;
    private FrequencyShortList repaymentFrequency;
    private YesNoList risksExplained;
    private DurationType interestOnlyDuration;
    private InterestOnlyReasonClass reason;
}
