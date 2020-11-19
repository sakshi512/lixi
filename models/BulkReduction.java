package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BulkReduction {
    private Double amount;
    private String estimatedDate;
}
