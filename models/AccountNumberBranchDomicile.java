package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AccountNumberBranchDomicile {
    private String internalName;
    private String internalNumber;
}
