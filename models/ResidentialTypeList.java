package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResidentialTypeList {
    AGED_CARE_UNIT, APARTMENT_UNIT_FLAT, BEDSITTER_BACHELOR, COMPANY_TITLE_UNIT, CONVERTED_COMMERCIAL_PROPERTY, CONVERTED_INDUSTRIAL_PROPERTY, CONVERTED_MOTEL_UNITS, DISPLAY_HOUSE, DUPLEX, FULLY_DETACHED_HOUSE, HIGH_DENSITY_APARTMENT, HOLIDAY_HOME, HOLIDAY_RENTAL, IMPROVED_LAND, KIT_HOME, LOW_DENSITY_APARTMENT, LUXURY_HOUSE, LUXURY_OTHER, MEDIUM_DENSITY_APARTMENT, PROPERTY_DEVELOPMENT, RELOCATABLE_HOME, RESORT_UNIT, SEMI_DETACHED_HOUSE, SERVICED_APARTMENT, STRATA_HOTEL_UNIT, STRATA_TITLE_UNIT, STUDIO_WAREHOUSE_APARTMENT, TERRACE, TOWNHOUSE, UNIT_STUDENT_ACCOMMODATION, VACANT_LAND, VILLA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AGED_CARE_UNIT: return "Aged Care Unit";
            case APARTMENT_UNIT_FLAT: return "Apartment Unit Flat";
            case BEDSITTER_BACHELOR: return "Bedsitter Bachelor";
            case COMPANY_TITLE_UNIT: return "Company Title Unit";
            case CONVERTED_COMMERCIAL_PROPERTY: return "Converted Commercial Property";
            case CONVERTED_INDUSTRIAL_PROPERTY: return "Converted Industrial Property";
            case CONVERTED_MOTEL_UNITS: return "Converted Motel Units";
            case DISPLAY_HOUSE: return "Display House";
            case DUPLEX: return "Duplex";
            case FULLY_DETACHED_HOUSE: return "Fully Detached House";
            case HIGH_DENSITY_APARTMENT: return "High Density Apartment";
            case HOLIDAY_HOME: return "Holiday Home";
            case HOLIDAY_RENTAL: return "Holiday Rental";
            case IMPROVED_LAND: return "Improved Land";
            case KIT_HOME: return "Kit Home";
            case LOW_DENSITY_APARTMENT: return "Low Density Apartment";
            case LUXURY_HOUSE: return "Luxury House";
            case LUXURY_OTHER: return "Luxury Other";
            case MEDIUM_DENSITY_APARTMENT: return "Medium Density Apartment";
            case PROPERTY_DEVELOPMENT: return "Property Development";
            case RELOCATABLE_HOME: return "Relocatable Home";
            case RESORT_UNIT: return "Resort Unit";
            case SEMI_DETACHED_HOUSE: return "Semi Detached House";
            case SERVICED_APARTMENT: return "Serviced Apartment";
            case STRATA_HOTEL_UNIT: return "Strata Hotel Unit";
            case STRATA_TITLE_UNIT: return "Strata Title Unit";
            case STUDIO_WAREHOUSE_APARTMENT: return "Studio Warehouse Apartment";
            case TERRACE: return "Terrace";
            case TOWNHOUSE: return "Townhouse";
            case UNIT_STUDENT_ACCOMMODATION: return "Unit Student Accommodation";
            case VACANT_LAND: return "Vacant Land";
            case VILLA: return "Villa";
        }
        return null;
    }

    @JsonCreator
    public static ResidentialTypeList forValue(String value) throws IOException {
        if (value.equals("Aged Care Unit")) return AGED_CARE_UNIT;
        if (value.equals("Apartment Unit Flat")) return APARTMENT_UNIT_FLAT;
        if (value.equals("Bedsitter Bachelor")) return BEDSITTER_BACHELOR;
        if (value.equals("Company Title Unit")) return COMPANY_TITLE_UNIT;
        if (value.equals("Converted Commercial Property")) return CONVERTED_COMMERCIAL_PROPERTY;
        if (value.equals("Converted Industrial Property")) return CONVERTED_INDUSTRIAL_PROPERTY;
        if (value.equals("Converted Motel Units")) return CONVERTED_MOTEL_UNITS;
        if (value.equals("Display House")) return DISPLAY_HOUSE;
        if (value.equals("Duplex")) return DUPLEX;
        if (value.equals("Fully Detached House")) return FULLY_DETACHED_HOUSE;
        if (value.equals("High Density Apartment")) return HIGH_DENSITY_APARTMENT;
        if (value.equals("Holiday Home")) return HOLIDAY_HOME;
        if (value.equals("Holiday Rental")) return HOLIDAY_RENTAL;
        if (value.equals("Improved Land")) return IMPROVED_LAND;
        if (value.equals("Kit Home")) return KIT_HOME;
        if (value.equals("Low Density Apartment")) return LOW_DENSITY_APARTMENT;
        if (value.equals("Luxury House")) return LUXURY_HOUSE;
        if (value.equals("Luxury Other")) return LUXURY_OTHER;
        if (value.equals("Medium Density Apartment")) return MEDIUM_DENSITY_APARTMENT;
        if (value.equals("Property Development")) return PROPERTY_DEVELOPMENT;
        if (value.equals("Relocatable Home")) return RELOCATABLE_HOME;
        if (value.equals("Resort Unit")) return RESORT_UNIT;
        if (value.equals("Semi Detached House")) return SEMI_DETACHED_HOUSE;
        if (value.equals("Serviced Apartment")) return SERVICED_APARTMENT;
        if (value.equals("Strata Hotel Unit")) return STRATA_HOTEL_UNIT;
        if (value.equals("Strata Title Unit")) return STRATA_TITLE_UNIT;
        if (value.equals("Studio Warehouse Apartment")) return STUDIO_WAREHOUSE_APARTMENT;
        if (value.equals("Terrace")) return TERRACE;
        if (value.equals("Townhouse")) return TOWNHOUSE;
        if (value.equals("Unit Student Accommodation")) return UNIT_STUDENT_ACCOMMODATION;
        if (value.equals("Vacant Land")) return VACANT_LAND;
        if (value.equals("Villa")) return VILLA;
        throw new IOException("Cannot deserialize ResidentialTypeList");
    }
}
