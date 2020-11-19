package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SignatureContact {
    private String email;
    private PhoneType mobile;
}
