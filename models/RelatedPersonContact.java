package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RelatedPersonContact {
    private String email;
    private ContactEmailTypeList emailType;
    private PreferredContactPersonList preferredContact;
    private String xAddress;
    private PhoneType homePhone;
    private PhoneType mobile;
    private PhoneType workPhone;
}
