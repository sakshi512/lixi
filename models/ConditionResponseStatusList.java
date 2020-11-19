package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConditionResponseStatusList {
    MET, NOT_MET, PARTIALLY_MET;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MET: return "Met";
            case NOT_MET: return "Not Met";
            case PARTIALLY_MET: return "Partially Met";
        }
        return null;
    }

    @JsonCreator
    public static ConditionResponseStatusList forValue(String value) throws IOException {
        if (value.equals("Met")) return MET;
        if (value.equals("Not Met")) return NOT_MET;
        if (value.equals("Partially Met")) return PARTIALLY_MET;
        throw new IOException("Cannot deserialize ConditionResponseStatusList");
    }
}
