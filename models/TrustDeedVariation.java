package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustDeedVariation {
    private String date;
    private String description;
    private String uniqueID;
}
