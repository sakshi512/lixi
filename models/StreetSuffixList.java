package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StreetSuffixList {
    CENTRAL, DEVIATION, EAST, EXTENSION, INNER, LOWER, MALL, NORTH, NORTH_EAST, NORTH_WEST, OFF, ON, OUTER, OVERPASS, SOUTH, SOUTH_EAST, SOUTH_WEST, UPPER, WEST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CENTRAL: return "Central";
            case DEVIATION: return "Deviation";
            case EAST: return "East";
            case EXTENSION: return "Extension";
            case INNER: return "Inner";
            case LOWER: return "Lower";
            case MALL: return "Mall";
            case NORTH: return "North";
            case NORTH_EAST: return "North East";
            case NORTH_WEST: return "North West";
            case OFF: return "Off";
            case ON: return "On";
            case OUTER: return "Outer";
            case OVERPASS: return "Overpass";
            case SOUTH: return "South";
            case SOUTH_EAST: return "South East";
            case SOUTH_WEST: return "South West";
            case UPPER: return "Upper";
            case WEST: return "West";
        }
        return null;
    }

    @JsonCreator
    public static StreetSuffixList forValue(String value) throws IOException {
        if (value.equals("Central")) return CENTRAL;
        if (value.equals("Deviation")) return DEVIATION;
        if (value.equals("East")) return EAST;
        if (value.equals("Extension")) return EXTENSION;
        if (value.equals("Inner")) return INNER;
        if (value.equals("Lower")) return LOWER;
        if (value.equals("Mall")) return MALL;
        if (value.equals("North")) return NORTH;
        if (value.equals("North East")) return NORTH_EAST;
        if (value.equals("North West")) return NORTH_WEST;
        if (value.equals("Off")) return OFF;
        if (value.equals("On")) return ON;
        if (value.equals("Outer")) return OUTER;
        if (value.equals("Overpass")) return OVERPASS;
        if (value.equals("South")) return SOUTH;
        if (value.equals("South East")) return SOUTH_EAST;
        if (value.equals("South West")) return SOUTH_WEST;
        if (value.equals("Upper")) return UPPER;
        if (value.equals("West")) return WEST;
        throw new IOException("Cannot deserialize StreetSuffixList");
    }
}
