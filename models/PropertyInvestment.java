package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PropertyInvestment {
    private String details;
    private YesNoIntentList isInvolved;
}
