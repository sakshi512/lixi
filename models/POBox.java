package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class POBox {
    private String exchange;
    private String number;
    private PoBoxTypeList type;
}
