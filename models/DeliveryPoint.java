package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DeliveryPoint {
    private String identifier;
    private String identifierBarcode;
}
