package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NccpStatusList {
    REGULATED, UNREGULATED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REGULATED: return "Regulated";
            case UNREGULATED: return "Unregulated";
        }
        return null;
    }

    @JsonCreator
    public static NccpStatusList forValue(String value) throws IOException {
        if (value.equals("Regulated")) return REGULATED;
        if (value.equals("Unregulated")) return UNREGULATED;
        throw new IOException("Cannot deserialize NccpStatusList");
    }
}
