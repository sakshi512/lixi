package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleBaseRate {
    private String code;
    private String name;
    private Double rate;
}
