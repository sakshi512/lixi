package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TransactionTypeList {
    CREDIT, DEBIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CREDIT: return "Credit";
            case DEBIT: return "Debit";
        }
        return null;
    }

    @JsonCreator
    public static TransactionTypeList forValue(String value) throws IOException {
        if (value.equals("Credit")) return CREDIT;
        if (value.equals("Debit")) return DEBIT;
        throw new IOException("Cannot deserialize TransactionTypeList");
    }
}
