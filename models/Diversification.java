package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Diversification {
    private String details;
    private String diversifiedDate;
    private YesNoList isDiversified;
}
