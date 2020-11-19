package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MaterialsHandlingAndLiftingTypeList {
    CRANE, FORKLIFT, JACK_LIFTING, LIFT_ELEVATOR, OTHER, SCISSOR_LIFT, STORAGE, TELESCOPIC_HANDLER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CRANE: return "Crane";
            case FORKLIFT: return "Forklift";
            case JACK_LIFTING: return "Jack / Lifting";
            case LIFT_ELEVATOR: return "Lift / Elevator";
            case OTHER: return "Other";
            case SCISSOR_LIFT: return "Scissor Lift";
            case STORAGE: return "Storage";
            case TELESCOPIC_HANDLER: return "Telescopic Handler";
        }
        return null;
    }

    @JsonCreator
    public static MaterialsHandlingAndLiftingTypeList forValue(String value) throws IOException {
        if (value.equals("Crane")) return CRANE;
        if (value.equals("Forklift")) return FORKLIFT;
        if (value.equals("Jack / Lifting")) return JACK_LIFTING;
        if (value.equals("Lift / Elevator")) return LIFT_ELEVATOR;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Scissor Lift")) return SCISSOR_LIFT;
        if (value.equals("Storage")) return STORAGE;
        if (value.equals("Telescopic Handler")) return TELESCOPIC_HANDLER;
        throw new IOException("Cannot deserialize MaterialsHandlingAndLiftingTypeList");
    }
}
