package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessChannelContact {
    private String email;
    private String webAddress;
    private String xAddress;
    private PurpleContactPerson contactPerson;
    private PhoneType officeFax;
    private PhoneType officePhone;
}
