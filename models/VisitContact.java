package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class VisitContact {
    private YesNoList boatAccessOnly;
    private String details;
    private YesNoList fourWDAccessOnly;
    private VisitContactTypeList type;
    private String xContactParty;
}
