package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Shareholder {
    private Double percentOwned;
    private String xShareholder;
}
