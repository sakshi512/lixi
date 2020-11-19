package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AssessmentTypeApplicationInstructionsList {
    FULL, INDICATIVE, QUOTE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULL: return "Full";
            case INDICATIVE: return "Indicative";
            case QUOTE: return "Quote";
        }
        return null;
    }

    @JsonCreator
    public static AssessmentTypeApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Full")) return FULL;
        if (value.equals("Indicative")) return INDICATIVE;
        if (value.equals("Quote")) return QUOTE;
        throw new IOException("Cannot deserialize AssessmentTypeApplicationInstructionsList");
    }
}
