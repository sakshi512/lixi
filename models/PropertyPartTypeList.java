package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PropertyPartTypeList {
    CAR_SPACE, GARAGE, GRANNY_FLAT, ROOM_WITHIN_MAIN_RESIDENCE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAR_SPACE: return "Car Space";
            case GARAGE: return "Garage";
            case GRANNY_FLAT: return "Granny Flat";
            case ROOM_WITHIN_MAIN_RESIDENCE: return "Room Within Main Residence";
        }
        return null;
    }

    @JsonCreator
    public static PropertyPartTypeList forValue(String value) throws IOException {
        if (value.equals("Car Space")) return CAR_SPACE;
        if (value.equals("Garage")) return GARAGE;
        if (value.equals("Granny Flat")) return GRANNY_FLAT;
        if (value.equals("Room Within Main Residence")) return ROOM_WITHIN_MAIN_RESIDENCE;
        throw new IOException("Cannot deserialize PropertyPartTypeList");
    }
}
