package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LIXITransactionType {
    CAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAL: return "CAL";
        }
        return null;
    }

    @JsonCreator
    public static LIXITransactionType forValue(String value) throws IOException {
        if (value.equals("CAL")) return CAL;
        throw new IOException("Cannot deserialize LIXITransactionType");
    }
}
