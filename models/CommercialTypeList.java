package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CommercialTypeList {
    BLOCK_OF_UNITS_OR_FLATS, FACTORY, MULTIPLE_DWELLING_DEVELOPMENT, NON_SPECIALISED_COMMERCIAL, OFFICES, OTHER, PROFESSIONAL_CHAMBERS, RESIDENTIAL_COMMERCIAL, RETIREMENT_VILLAGE, VACANT_LAND, WAREHOUSE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BLOCK_OF_UNITS_OR_FLATS: return "Block of Units or Flats";
            case FACTORY: return "Factory";
            case MULTIPLE_DWELLING_DEVELOPMENT: return "Multiple Dwelling Development";
            case NON_SPECIALISED_COMMERCIAL: return "Non Specialised Commercial";
            case OFFICES: return "Offices";
            case OTHER: return "Other";
            case PROFESSIONAL_CHAMBERS: return "Professional Chambers";
            case RESIDENTIAL_COMMERCIAL: return "Residential Commercial";
            case RETIREMENT_VILLAGE: return "Retirement Village";
            case VACANT_LAND: return "Vacant Land";
            case WAREHOUSE: return "Warehouse";
        }
        return null;
    }

    @JsonCreator
    public static CommercialTypeList forValue(String value) throws IOException {
        if (value.equals("Block of Units or Flats")) return BLOCK_OF_UNITS_OR_FLATS;
        if (value.equals("Factory")) return FACTORY;
        if (value.equals("Multiple Dwelling Development")) return MULTIPLE_DWELLING_DEVELOPMENT;
        if (value.equals("Non Specialised Commercial")) return NON_SPECIALISED_COMMERCIAL;
        if (value.equals("Offices")) return OFFICES;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Professional Chambers")) return PROFESSIONAL_CHAMBERS;
        if (value.equals("Residential Commercial")) return RESIDENTIAL_COMMERCIAL;
        if (value.equals("Retirement Village")) return RETIREMENT_VILLAGE;
        if (value.equals("Vacant Land")) return VACANT_LAND;
        if (value.equals("Warehouse")) return WAREHOUSE;
        throw new IOException("Cannot deserialize CommercialTypeList");
    }
}
