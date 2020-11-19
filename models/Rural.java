package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Rural {
    private Long numberOfBuildings;
    private RuralTypeList type;
    private RuralUsageList usage;
}
