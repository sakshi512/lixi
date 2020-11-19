package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanWriterContact {
    private String email;
    private String webAddress;
    private String xAddress;
    private PhoneType fax;
    private PhoneType mobile;
    private PhoneType officePhone;
}
