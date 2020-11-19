package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BalloonRVInputPatternList {
    AMOUNT, PERCENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMOUNT: return "Amount";
            case PERCENT: return "Percent";
        }
        return null;
    }

    @JsonCreator
    public static BalloonRVInputPatternList forValue(String value) throws IOException {
        if (value.equals("Amount")) return AMOUNT;
        if (value.equals("Percent")) return PERCENT;
        throw new IOException("Cannot deserialize BalloonRVInputPatternList");
    }
}
