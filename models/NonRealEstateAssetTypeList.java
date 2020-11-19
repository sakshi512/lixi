package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NonRealEstateAssetTypeList {
    AGRICULTURAL, AIRCRAFT, BUSINESS, CLEANING, EARTH_MOVING_MINING_AND_CONSTRUCTION, FINANCIAL_ASSET, HOSPITALITY_AND_LEISURE, IT_AND_AV_EQUIPMENT, MATERIALS_HANDLING_AND_LIFTING, MEDICAL, MOBILE_COMPUTING, MOTOR_VEHICLE_AND_TRANSPORT, OFFICE_EQUIPMENT, OTHER, PLANT_EQUIPMENT_AND_INDUSTRIAL, TOOLS_OF_TRADE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AGRICULTURAL: return "Agricultural";
            case AIRCRAFT: return "Aircraft";
            case BUSINESS: return "Business";
            case CLEANING: return "Cleaning";
            case EARTH_MOVING_MINING_AND_CONSTRUCTION: return "Earth Moving, Mining and Construction";
            case FINANCIAL_ASSET: return "Financial Asset";
            case HOSPITALITY_AND_LEISURE: return "Hospitality and Leisure";
            case IT_AND_AV_EQUIPMENT: return "IT and AV Equipment";
            case MATERIALS_HANDLING_AND_LIFTING: return "Materials Handling and Lifting";
            case MEDICAL: return "Medical";
            case MOBILE_COMPUTING: return "Mobile Computing";
            case MOTOR_VEHICLE_AND_TRANSPORT: return "Motor Vehicle and Transport";
            case OFFICE_EQUIPMENT: return "Office Equipment";
            case OTHER: return "Other";
            case PLANT_EQUIPMENT_AND_INDUSTRIAL: return "Plant, Equipment and Industrial";
            case TOOLS_OF_TRADE: return "Tools of Trade";
        }
        return null;
    }

    @JsonCreator
    public static NonRealEstateAssetTypeList forValue(String value) throws IOException {
        if (value.equals("Agricultural")) return AGRICULTURAL;
        if (value.equals("Aircraft")) return AIRCRAFT;
        if (value.equals("Business")) return BUSINESS;
        if (value.equals("Cleaning")) return CLEANING;
        if (value.equals("Earth Moving, Mining and Construction")) return EARTH_MOVING_MINING_AND_CONSTRUCTION;
        if (value.equals("Financial Asset")) return FINANCIAL_ASSET;
        if (value.equals("Hospitality and Leisure")) return HOSPITALITY_AND_LEISURE;
        if (value.equals("IT and AV Equipment")) return IT_AND_AV_EQUIPMENT;
        if (value.equals("Materials Handling and Lifting")) return MATERIALS_HANDLING_AND_LIFTING;
        if (value.equals("Medical")) return MEDICAL;
        if (value.equals("Mobile Computing")) return MOBILE_COMPUTING;
        if (value.equals("Motor Vehicle and Transport")) return MOTOR_VEHICLE_AND_TRANSPORT;
        if (value.equals("Office Equipment")) return OFFICE_EQUIPMENT;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Plant, Equipment and Industrial")) return PLANT_EQUIPMENT_AND_INDUSTRIAL;
        if (value.equals("Tools of Trade")) return TOOLS_OF_TRADE;
        throw new IOException("Cannot deserialize NonRealEstateAssetTypeList");
    }
}
