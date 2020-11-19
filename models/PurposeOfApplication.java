package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurposeOfApplication {
    private Double amount;
    private String description;
    private PurposeOfApplicationList purpose;
}
