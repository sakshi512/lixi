package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BillerDetails {
    private String billerCode;
    private String billerName;
    private String crn;
}
