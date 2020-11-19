package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DepositAccountTypeList {
    STANDARD, TERM_DEPOSIT, TRANSACTIONAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STANDARD: return "Standard";
            case TERM_DEPOSIT: return "Term Deposit";
            case TRANSACTIONAL: return "Transactional";
        }
        return null;
    }

    @JsonCreator
    public static DepositAccountTypeList forValue(String value) throws IOException {
        if (value.equals("Standard")) return STANDARD;
        if (value.equals("Term Deposit")) return TERM_DEPOSIT;
        if (value.equals("Transactional")) return TRANSACTIONAL;
        throw new IOException("Cannot deserialize DepositAccountTypeList");
    }
}
