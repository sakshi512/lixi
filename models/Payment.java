package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Payment {
    private Double amount;
    private String date;
    private Double gstAmount;
    private Long sequenceNumber;
    private Double stampDutyAmount;
    private String uniqueID;
}
