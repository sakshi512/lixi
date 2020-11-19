package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RelatedLegalEntities {
    private String currentCustomers;
    private Long entityCount;
}
