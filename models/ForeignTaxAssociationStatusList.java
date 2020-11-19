package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ForeignTaxAssociationStatusList {
    FULLY_PROVIDED, NONE, NOT_PROVIDED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FULLY_PROVIDED: return "Fully Provided";
            case NONE: return "None";
            case NOT_PROVIDED: return "Not Provided";
        }
        return null;
    }

    @JsonCreator
    public static ForeignTaxAssociationStatusList forValue(String value) throws IOException {
        if (value.equals("Fully Provided")) return FULLY_PROVIDED;
        if (value.equals("None")) return NONE;
        if (value.equals("Not Provided")) return NOT_PROVIDED;
        throw new IOException("Cannot deserialize ForeignTaxAssociationStatusList");
    }
}
