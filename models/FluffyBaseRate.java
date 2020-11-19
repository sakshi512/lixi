package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffyBaseRate {
    private String code;
    private String name;
    private Double rate;
}
