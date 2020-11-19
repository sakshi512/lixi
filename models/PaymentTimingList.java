package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PaymentTimingList {
    IN_ADVANCE, IN_ARREARS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IN_ADVANCE: return "In Advance";
            case IN_ARREARS: return "In Arrears";
        }
        return null;
    }

    @JsonCreator
    public static PaymentTimingList forValue(String value) throws IOException {
        if (value.equals("In Advance")) return IN_ADVANCE;
        if (value.equals("In Arrears")) return IN_ARREARS;
        throw new IOException("Cannot deserialize PaymentTimingList");
    }
}
