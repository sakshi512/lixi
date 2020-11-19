package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MasterAgreementStatusList {
    EXISTING, NEW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXISTING: return "Existing";
            case NEW: return "New";
        }
        return null;
    }

    @JsonCreator
    public static MasterAgreementStatusList forValue(String value) throws IOException {
        if (value.equals("Existing")) return EXISTING;
        if (value.equals("New")) return NEW;
        throw new IOException("Cannot deserialize MasterAgreementStatusList");
    }
}
