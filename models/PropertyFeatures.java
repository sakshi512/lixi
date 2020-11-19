package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PropertyFeatures {
    private String allPropertyFeatures;
    private Double floorArea;
    private Double landArea;
    private LandAreaUnitsList landAreaUnits;
    private Long numberOfBathrooms;
    private Long numberOfBedrooms;
    private Long numberOfCarSpaces;
    private PoolTypeList poolType;
    private String propertyDescription;
    private String propertyImage;
    private String roofMaterial;
    private String wallMaterial;
}
