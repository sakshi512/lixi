package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BranchDomicileContact {
    private PhoneType officeFax;
    private PhoneType officePhone;
}
