package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CalculationBasisList {
    BALANCE, LIMIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BALANCE: return "Balance";
            case LIMIT: return "Limit";
        }
        return null;
    }

    @JsonCreator
    public static CalculationBasisList forValue(String value) throws IOException {
        if (value.equals("Balance")) return BALANCE;
        if (value.equals("Limit")) return LIMIT;
        throw new IOException("Cannot deserialize CalculationBasisList");
    }
}
