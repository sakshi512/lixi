package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DataSourceList {
    GNAF, RP_DATA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GNAF: return "GNAF";
            case RP_DATA: return "RP Data";
        }
        return null;
    }

    @JsonCreator
    public static DataSourceList forValue(String value) throws IOException {
        if (value.equals("GNAF")) return GNAF;
        if (value.equals("RP Data")) return RP_DATA;
        throw new IOException("Cannot deserialize DataSourceList");
    }
}
