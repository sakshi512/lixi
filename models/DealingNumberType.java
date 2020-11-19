package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DealingNumberType {
    private AuStateList australianState;
    private String bookNumber;
    private String registeredNumber;
    private String uniqueID;
}
