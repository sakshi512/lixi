package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ImportExport {
    private String details;
    private YesNoIntentList isInvolved;
}
