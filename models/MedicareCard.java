package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MedicareCard {
    private MedicareCardColourList colour;
    private Long individualReferenceNumber;
}
