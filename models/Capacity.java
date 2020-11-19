package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Capacity {
    private CapacityTypeList type;
    private String xParentEntity;
    private String xProductSet;
}
