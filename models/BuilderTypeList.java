package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BuilderTypeList {
    LICENSED_BUILDER, OWNER_BUILDER, UNLICENSED_BUILDER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LICENSED_BUILDER: return "Licensed Builder";
            case OWNER_BUILDER: return "Owner Builder";
            case UNLICENSED_BUILDER: return "Unlicensed Builder";
        }
        return null;
    }

    @JsonCreator
    public static BuilderTypeList forValue(String value) throws IOException {
        if (value.equals("Licensed Builder")) return LICENSED_BUILDER;
        if (value.equals("Owner Builder")) return OWNER_BUILDER;
        if (value.equals("Unlicensed Builder")) return UNLICENSED_BUILDER;
        throw new IOException("Cannot deserialize BuilderTypeList");
    }
}
