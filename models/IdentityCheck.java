package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class IdentityCheck {
    private String dataSource;
    private String date;
    private YesNoList politicallyExposedPerson;
    private String referenceNumber;
    private String result;
    private YesNoList sanctionedPerson;
}
