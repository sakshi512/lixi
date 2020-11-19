package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RelatedCompanyContact {
    private String email;
    private String webAddress;
    private String xAddress;
    private TentacledContactPerson contactPerson;
    private PhoneType officeFax;
    private PhoneType officePhone;
}
