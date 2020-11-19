package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class EmailAddress {
    private String email;
    private ContactEmailTypeList emailType;
    private String uniqueID;
}
