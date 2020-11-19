package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LevelTypeList {
    BASEMENT, FLOOR, GROUND, LEVEL, LOWER_GROUND_FLOOR, LOWER_LEVEL, MEZZANINE, OBSERVATION_DECK, PARKING, PENTHOUSE, PLATFORM, PODIUM, ROOFTOP, SUB_BASEMENT, UPPER_GROUND_FLOOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BASEMENT: return "Basement";
            case FLOOR: return "Floor";
            case GROUND: return "Ground";
            case LEVEL: return "Level";
            case LOWER_GROUND_FLOOR: return "Lower Ground Floor";
            case LOWER_LEVEL: return "Lower Level";
            case MEZZANINE: return "Mezzanine";
            case OBSERVATION_DECK: return "Observation Deck";
            case PARKING: return "Parking";
            case PENTHOUSE: return "Penthouse";
            case PLATFORM: return "Platform";
            case PODIUM: return "Podium";
            case ROOFTOP: return "Rooftop";
            case SUB_BASEMENT: return "Sub-basement";
            case UPPER_GROUND_FLOOR: return "Upper Ground Floor";
        }
        return null;
    }

    @JsonCreator
    public static LevelTypeList forValue(String value) throws IOException {
        if (value.equals("Basement")) return BASEMENT;
        if (value.equals("Floor")) return FLOOR;
        if (value.equals("Ground")) return GROUND;
        if (value.equals("Level")) return LEVEL;
        if (value.equals("Lower Ground Floor")) return LOWER_GROUND_FLOOR;
        if (value.equals("Lower Level")) return LOWER_LEVEL;
        if (value.equals("Mezzanine")) return MEZZANINE;
        if (value.equals("Observation Deck")) return OBSERVATION_DECK;
        if (value.equals("Parking")) return PARKING;
        if (value.equals("Penthouse")) return PENTHOUSE;
        if (value.equals("Platform")) return PLATFORM;
        if (value.equals("Podium")) return PODIUM;
        if (value.equals("Rooftop")) return ROOFTOP;
        if (value.equals("Sub-basement")) return SUB_BASEMENT;
        if (value.equals("Upper Ground Floor")) return UPPER_GROUND_FLOOR;
        throw new IOException("Cannot deserialize LevelTypeList");
    }
}
