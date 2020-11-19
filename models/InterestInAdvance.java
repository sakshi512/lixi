package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestInAdvance {
    private ImportanceList importance;
    private YesNoList risksExplained;
    private InterestInAdvanceReason reason;
}
