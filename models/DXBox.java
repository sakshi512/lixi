package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DXBox {
    private String exchange;
    private String number;
    private String provider;
}
