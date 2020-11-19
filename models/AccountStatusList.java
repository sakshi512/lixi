package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AccountStatusList {
    ADD_EXISTING, CREATE_NEW, UPGRADE_EXISTING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADD_EXISTING: return "Add Existing";
            case CREATE_NEW: return "Create New";
            case UPGRADE_EXISTING: return "Upgrade Existing";
        }
        return null;
    }

    @JsonCreator
    public static AccountStatusList forValue(String value) throws IOException {
        if (value.equals("Add Existing")) return ADD_EXISTING;
        if (value.equals("Create New")) return CREATE_NEW;
        if (value.equals("Upgrade Existing")) return UPGRADE_EXISTING;
        throw new IOException("Cannot deserialize AccountStatusList");
    }
}
