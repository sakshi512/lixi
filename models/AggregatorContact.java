package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AggregatorContact {
    private String email;
    private String webAddress;
    private String xAddress;
    private PhoneType officeFax;
    private PhoneType officePhone;
}
