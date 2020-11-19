package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PhoneType {
    private AuDialingCodeList australianDialingCode;
    private String countryCode;
    private String number;
    private String overseasDialingCode;
}
