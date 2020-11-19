package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConditionStatusApplicationInstructionsList {
    NOT_SATISFIED, OPEN, REFERRED_TO_ASSESSOR, SATISFIED, WAIVED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NOT_SATISFIED: return "Not Satisfied";
            case OPEN: return "Open";
            case REFERRED_TO_ASSESSOR: return "Referred to Assessor";
            case SATISFIED: return "Satisfied";
            case WAIVED: return "Waived";
        }
        return null;
    }

    @JsonCreator
    public static ConditionStatusApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Not Satisfied")) return NOT_SATISFIED;
        if (value.equals("Open")) return OPEN;
        if (value.equals("Referred to Assessor")) return REFERRED_TO_ASSESSOR;
        if (value.equals("Satisfied")) return SATISFIED;
        if (value.equals("Waived")) return WAIVED;
        throw new IOException("Cannot deserialize ConditionStatusApplicationInstructionsList");
    }
}
