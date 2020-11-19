package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AccountToIncorporate {
    private String xExistingAccount;
    private String xNewAccount;
}
