package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LiabilityArrears {
    private Double amount;
    private Long numberOfMissedPayments;
}
