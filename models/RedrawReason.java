package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RedrawReason {
    private String description;
    private YesNoList flexibilityToAccessPrepaidFundsIfNeeded;
    private YesNoList other;
}
