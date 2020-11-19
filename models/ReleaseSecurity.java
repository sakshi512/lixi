package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ReleaseSecurity {
    private String actionDate;
    private ReleaseSecurityReasonList reason;
    private String xSecurity;
}
