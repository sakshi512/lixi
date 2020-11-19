package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OverviewBranchDomicile {
    private String bsb;
    private String internalName;
    private String internalNumber;
    private BranchDomicileContact contact;
}
