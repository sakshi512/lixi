package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SelfEmployedBasisList {
    CASUAL, CONTRACT, FULL_TIME, PART_TIME, TEMPORARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASUAL: return "Casual";
            case CONTRACT: return "Contract";
            case FULL_TIME: return "Full Time";
            case PART_TIME: return "Part Time";
            case TEMPORARY: return "Temporary";
        }
        return null;
    }

    @JsonCreator
    public static SelfEmployedBasisList forValue(String value) throws IOException {
        if (value.equals("Casual")) return CASUAL;
        if (value.equals("Contract")) return CONTRACT;
        if (value.equals("Full Time")) return FULL_TIME;
        if (value.equals("Part Time")) return PART_TIME;
        if (value.equals("Temporary")) return TEMPORARY;
        throw new IOException("Cannot deserialize SelfEmployedBasisList");
    }
}
