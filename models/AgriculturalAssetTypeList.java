package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AgriculturalAssetTypeList {
    ALL_TERRAIN_VEHICLE, CROPS_HAY, FENCING, FERTILISER_SLURRY, GPS_LASER_LEVELLING, HANDLING_STORAGE, HARVESTER_HEADER, IRRIGATION, LIVESTOCK, OTHER, SEEDING_PLANTING, SPRAYER, STORAGE, TILLAGE_EQUIPMENT, TRACTOR_FRONT_ATTACHMENTS, TRACTOR_WHEELED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALL_TERRAIN_VEHICLE: return "All Terrain Vehicle";
            case CROPS_HAY: return "Crops / Hay";
            case FENCING: return "Fencing";
            case FERTILISER_SLURRY: return "Fertiliser / Slurry";
            case GPS_LASER_LEVELLING: return "GPS / Laser / Levelling";
            case HANDLING_STORAGE: return "Handling / Storage";
            case HARVESTER_HEADER: return "Harvester / Header";
            case IRRIGATION: return "Irrigation";
            case LIVESTOCK: return "Livestock";
            case OTHER: return "Other";
            case SEEDING_PLANTING: return "Seeding / Planting";
            case SPRAYER: return "Sprayer";
            case STORAGE: return "Storage";
            case TILLAGE_EQUIPMENT: return "Tillage Equipment";
            case TRACTOR_FRONT_ATTACHMENTS: return "Tractor Front Attachments";
            case TRACTOR_WHEELED: return "Tractor - Wheeled";
        }
        return null;
    }

    @JsonCreator
    public static AgriculturalAssetTypeList forValue(String value) throws IOException {
        if (value.equals("All Terrain Vehicle")) return ALL_TERRAIN_VEHICLE;
        if (value.equals("Crops / Hay")) return CROPS_HAY;
        if (value.equals("Fencing")) return FENCING;
        if (value.equals("Fertiliser / Slurry")) return FERTILISER_SLURRY;
        if (value.equals("GPS / Laser / Levelling")) return GPS_LASER_LEVELLING;
        if (value.equals("Handling / Storage")) return HANDLING_STORAGE;
        if (value.equals("Harvester / Header")) return HARVESTER_HEADER;
        if (value.equals("Irrigation")) return IRRIGATION;
        if (value.equals("Livestock")) return LIVESTOCK;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Seeding / Planting")) return SEEDING_PLANTING;
        if (value.equals("Sprayer")) return SPRAYER;
        if (value.equals("Storage")) return STORAGE;
        if (value.equals("Tillage Equipment")) return TILLAGE_EQUIPMENT;
        if (value.equals("Tractor Front Attachments")) return TRACTOR_FRONT_ATTACHMENTS;
        if (value.equals("Tractor - Wheeled")) return TRACTOR_WHEELED;
        throw new IOException("Cannot deserialize AgriculturalAssetTypeList");
    }
}
