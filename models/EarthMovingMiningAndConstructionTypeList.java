package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EarthMovingMiningAndConstructionTypeList {
    CONCRETE_EQUIPMENT, CONVEYOR, CRUSHING_SCREENING, DOZER, DRILL_RIG, EXCAVATOR_FACE_SHOVEL, FORESTRY, GRADER, LOADER, OFF_HIGHWAY_TRUCK, OTHER, ROAD_MAINTENANCE, ROLLER_COMPACTING, SCRAPER, SWEEPING_CLEANING, TRENCHING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONCRETE_EQUIPMENT: return "Concrete Equipment";
            case CONVEYOR: return "Conveyor";
            case CRUSHING_SCREENING: return "Crushing / Screening";
            case DOZER: return "Dozer";
            case DRILL_RIG: return "Drill Rig";
            case EXCAVATOR_FACE_SHOVEL: return "Excavator / Face Shovel";
            case FORESTRY: return "Forestry";
            case GRADER: return "Grader";
            case LOADER: return "Loader";
            case OFF_HIGHWAY_TRUCK: return "Off Highway Truck";
            case OTHER: return "Other";
            case ROAD_MAINTENANCE: return "Road Maintenance";
            case ROLLER_COMPACTING: return "Roller / Compacting";
            case SCRAPER: return "Scraper";
            case SWEEPING_CLEANING: return "Sweeping / Cleaning";
            case TRENCHING: return "Trenching";
        }
        return null;
    }

    @JsonCreator
    public static EarthMovingMiningAndConstructionTypeList forValue(String value) throws IOException {
        if (value.equals("Concrete Equipment")) return CONCRETE_EQUIPMENT;
        if (value.equals("Conveyor")) return CONVEYOR;
        if (value.equals("Crushing / Screening")) return CRUSHING_SCREENING;
        if (value.equals("Dozer")) return DOZER;
        if (value.equals("Drill Rig")) return DRILL_RIG;
        if (value.equals("Excavator / Face Shovel")) return EXCAVATOR_FACE_SHOVEL;
        if (value.equals("Forestry")) return FORESTRY;
        if (value.equals("Grader")) return GRADER;
        if (value.equals("Loader")) return LOADER;
        if (value.equals("Off Highway Truck")) return OFF_HIGHWAY_TRUCK;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Road Maintenance")) return ROAD_MAINTENANCE;
        if (value.equals("Roller / Compacting")) return ROLLER_COMPACTING;
        if (value.equals("Scraper")) return SCRAPER;
        if (value.equals("Sweeping / Cleaning")) return SWEEPING_CLEANING;
        if (value.equals("Trenching")) return TRENCHING;
        throw new IOException("Cannot deserialize EarthMovingMiningAndConstructionTypeList");
    }
}
