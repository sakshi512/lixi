package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyContact {
    private String email;
    private String webAddress;
    private String xAddress;
    private PhoneType officeFax;
    private PhoneType officePhone;
}
