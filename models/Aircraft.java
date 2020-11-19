package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Aircraft {
    private String additionalIDType;
    private String additionalIDValue;
    private Long age;
    private Long airFrameHours;
    private ConditionList condition;
    private String conditionDescription;
    private String description;
    private Double effectiveLife;
    private Long engineHoursTotal;
    private Long engineHoursTTR;
    private String engineID;
    private String make;
    private String model;
    private String otherInformation;
    private Long quantity;
    private String registrationExpiryDate;
    private String registrationNumber;
    private String serialNumber;
    private String servicingHistory;
    private AircraftTypeList type;
    private String xGoodToBeUsedAddress;
    private String year;
}
