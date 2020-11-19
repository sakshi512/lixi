package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PlantEquipmentAndIndustrialTypeList {
    ARBORIST_AND_LANDSCAPING_EQUIPMENT, BUTCHERS_PLANT, CLEANING, COMPRESSORS, ENGINE, ENGINEERING_MACHINE, FITOUT, GENERATOR, HEATING_AND_COOLING, HOT_WATER_PLANT, LIGHTING_PLANT, MANUFACTURING_AND_MACHINING, OTHER, PHOTO_PROCESS_PLANT, POWER_METERING_EQUIPMENT, PRINTING_PRESS, PUMP, SEWING_MACHINE, SOLAR_DC_INVERTERS, SOLAR_ROOFTOP_PV, WOOD_WORKING_PLANT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ARBORIST_AND_LANDSCAPING_EQUIPMENT: return "Arborist and Landscaping Equipment";
            case BUTCHERS_PLANT: return "Butchers Plant";
            case CLEANING: return "Cleaning";
            case COMPRESSORS: return "Compressors";
            case ENGINE: return "Engine";
            case ENGINEERING_MACHINE: return "Engineering Machine";
            case FITOUT: return "Fitout";
            case GENERATOR: return "Generator";
            case HEATING_AND_COOLING: return "Heating and Cooling";
            case HOT_WATER_PLANT: return "Hot Water Plant";
            case LIGHTING_PLANT: return "Lighting Plant";
            case MANUFACTURING_AND_MACHINING: return "Manufacturing and Machining";
            case OTHER: return "Other";
            case PHOTO_PROCESS_PLANT: return "Photo Process Plant";
            case POWER_METERING_EQUIPMENT: return "Power Metering Equipment";
            case PRINTING_PRESS: return "Printing Press";
            case PUMP: return "Pump";
            case SEWING_MACHINE: return "Sewing Machine";
            case SOLAR_DC_INVERTERS: return "Solar DC Inverters";
            case SOLAR_ROOFTOP_PV: return "Solar Rooftop PV";
            case WOOD_WORKING_PLANT: return "Wood Working Plant";
        }
        return null;
    }

    @JsonCreator
    public static PlantEquipmentAndIndustrialTypeList forValue(String value) throws IOException {
        if (value.equals("Arborist and Landscaping Equipment")) return ARBORIST_AND_LANDSCAPING_EQUIPMENT;
        if (value.equals("Butchers Plant")) return BUTCHERS_PLANT;
        if (value.equals("Cleaning")) return CLEANING;
        if (value.equals("Compressors")) return COMPRESSORS;
        if (value.equals("Engine")) return ENGINE;
        if (value.equals("Engineering Machine")) return ENGINEERING_MACHINE;
        if (value.equals("Fitout")) return FITOUT;
        if (value.equals("Generator")) return GENERATOR;
        if (value.equals("Heating and Cooling")) return HEATING_AND_COOLING;
        if (value.equals("Hot Water Plant")) return HOT_WATER_PLANT;
        if (value.equals("Lighting Plant")) return LIGHTING_PLANT;
        if (value.equals("Manufacturing and Machining")) return MANUFACTURING_AND_MACHINING;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Photo Process Plant")) return PHOTO_PROCESS_PLANT;
        if (value.equals("Power Metering Equipment")) return POWER_METERING_EQUIPMENT;
        if (value.equals("Printing Press")) return PRINTING_PRESS;
        if (value.equals("Pump")) return PUMP;
        if (value.equals("Sewing Machine")) return SEWING_MACHINE;
        if (value.equals("Solar DC Inverters")) return SOLAR_DC_INVERTERS;
        if (value.equals("Solar Rooftop PV")) return SOLAR_ROOFTOP_PV;
        if (value.equals("Wood Working Plant")) return WOOD_WORKING_PLANT;
        throw new IOException("Cannot deserialize PlantEquipmentAndIndustrialTypeList");
    }
}
