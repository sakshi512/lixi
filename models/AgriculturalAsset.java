package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AgriculturalAsset {
    private String additionalIDType;
    private String additionalIDValue;
    private Long age;
    private ConditionList condition;
    private String conditionDescription;
    private String description;
    private Double effectiveLife;
    private Long engineHoursTotal;
    private String engineID;
    private GoodToBeUsedLocationList goodToBeUsedLocation;
    private String make;
    private String model;
    private String otherInformation;
    private Long quantity;
    private AuStateList registeredInState;
    private String registrationExpiryDate;
    private String registrationNumber;
    private String serialNumber;
    private String servicingHistory;
    private AgriculturalAssetTypeList type;
    private String xGoodToBeUsedAddress;
    private String year;
}
