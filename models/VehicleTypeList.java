package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VehicleTypeList {
    BICYCLE, BODIES, BUS_COACH_OR_SPECIAL_PURPOSE, CAR, CARAVAN, LIGHT_COMMERCIAL, LOCOMOTIVE, MOTORCYCLE, OTHER, RAIL_CARS, TRAILER, TRUCK, WATERCRAFT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BICYCLE: return "Bicycle";
            case BODIES: return "Bodies";
            case BUS_COACH_OR_SPECIAL_PURPOSE: return "Bus Coach or Special Purpose";
            case CAR: return "Car";
            case CARAVAN: return "Caravan";
            case LIGHT_COMMERCIAL: return "Light Commercial";
            case LOCOMOTIVE: return "Locomotive";
            case MOTORCYCLE: return "Motorcycle";
            case OTHER: return "Other";
            case RAIL_CARS: return "Rail Cars";
            case TRAILER: return "Trailer";
            case TRUCK: return "Truck";
            case WATERCRAFT: return "Watercraft";
        }
        return null;
    }

    @JsonCreator
    public static VehicleTypeList forValue(String value) throws IOException {
        if (value.equals("Bicycle")) return BICYCLE;
        if (value.equals("Bodies")) return BODIES;
        if (value.equals("Bus Coach or Special Purpose")) return BUS_COACH_OR_SPECIAL_PURPOSE;
        if (value.equals("Car")) return CAR;
        if (value.equals("Caravan")) return CARAVAN;
        if (value.equals("Light Commercial")) return LIGHT_COMMERCIAL;
        if (value.equals("Locomotive")) return LOCOMOTIVE;
        if (value.equals("Motorcycle")) return MOTORCYCLE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Rail Cars")) return RAIL_CARS;
        if (value.equals("Trailer")) return TRAILER;
        if (value.equals("Truck")) return TRUCK;
        if (value.equals("Watercraft")) return WATERCRAFT;
        throw new IOException("Cannot deserialize VehicleTypeList");
    }
}
