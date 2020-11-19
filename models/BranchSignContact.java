package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BranchSignContact {
    private PhoneType officeFax;
    private PhoneType officePhone;
}
