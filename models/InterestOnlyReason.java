package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class InterestOnlyReason {
    private String description;
    private InterestOnlyReasonList reason;
    private String uniqueID;
}
