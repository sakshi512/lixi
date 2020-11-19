package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CleaningEquipment {
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
    private CleaningEquipmentTypeList type;
    private String xGoodToBeUsedAddress;
    private String year;
}
