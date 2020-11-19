package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ValuationProgramList {
    AVM, COSTING, DESKTOP, FULL_REGISTERED, KERB_SIDE, NONE, PROGRESS_INSPECTION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AVM: return "AVM";
            case COSTING: return "Costing";
            case DESKTOP: return "Desktop";
            case FULL_REGISTERED: return "Full Registered";
            case KERB_SIDE: return "Kerb Side";
            case NONE: return "None";
            case PROGRESS_INSPECTION: return "Progress Inspection";
        }
        return null;
    }

    @JsonCreator
    public static ValuationProgramList forValue(String value) throws IOException {
        if (value.equals("AVM")) return AVM;
        if (value.equals("Costing")) return COSTING;
        if (value.equals("Desktop")) return DESKTOP;
        if (value.equals("Full Registered")) return FULL_REGISTERED;
        if (value.equals("Kerb Side")) return KERB_SIDE;
        if (value.equals("None")) return NONE;
        if (value.equals("Progress Inspection")) return PROGRESS_INSPECTION;
        throw new IOException("Cannot deserialize ValuationProgramList");
    }
}
