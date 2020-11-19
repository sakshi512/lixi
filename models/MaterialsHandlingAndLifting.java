package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MaterialsHandlingAndLifting {
    private String additionalIDType;
    private String additionalIDValue;
    private Long age;
    private ConditionList condition;
    private String conditionDescription;
    private String description;
    private Double effectiveLife;
    private GoodToBeUsedLocationList goodToBeUsedLocation;
    private String make;
    private String model;
    private String otherInformation;
    private Long quantity;
    private String serialNumber;
    private MaterialsHandlingAndLiftingTypeList type;
    private String xGoodToBeUsedAddress;
    private String year;
}
