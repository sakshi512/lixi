package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PreApproved {
    private Double establishmentAndGovernmentFees;
    private Double estimatedBorrowingPower;
    private Double estimatedRepaymentAmount;
    private String uniqueID;
}
