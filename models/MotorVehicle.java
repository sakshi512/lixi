package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MotorVehicle {
    private String additionalIDType;
    private String additionalIDValue;
    private Long age;
    private String badge;
    private String body;
    private String colour;
    private ConditionList condition;
    private String conditionDescription;
    private Long cylinders;
    private String description;
    private Long doors;
    private Double effectiveLife;
    private Double engineCapacity;
    private Long engineHoursTotal;
    private String engineID;
    private String fuelType;
    private Long kilometres;
    private String make;
    private String model;
    private String options;
    private String otherInformation;
    private Long quantity;
    private AuStateList registeredInState;
    private String registrationExpiryDate;
    private String registrationNumber;
    private String serialNumber;
    private String series;
    private String transmission;
    private VehicleTypeList type;
    private String variant;
    private String xGoodToBeUsedAddress;
    private String year;
}
