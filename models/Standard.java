package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Standard {
    private String buildingName;
    private String level;
    private LevelTypeList levelType;
    private String lotSection;
    private String streetName;
    private String streetNumber;
    private StreetSuffixList streetSuffix;
    private StreetTypeList streetType;
    private String toStreetNumber;
    private String toUnitNumber;
    private String unit;
    private UnitTypeList unitType;
}
