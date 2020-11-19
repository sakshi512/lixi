package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BranchSign {
    private String bsb;
    private String internalName;
    private String internalNumber;
    private BranchSignContact contact;
}
