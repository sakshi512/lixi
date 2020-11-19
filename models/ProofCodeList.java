package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProofCodeList {
    FINANCIAL_STATEMENT, TAX_ASSESSMENT, TAX_RETURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FINANCIAL_STATEMENT: return "Financial Statement";
            case TAX_ASSESSMENT: return "Tax Assessment";
            case TAX_RETURN: return "Tax Return";
        }
        return null;
    }

    @JsonCreator
    public static ProofCodeList forValue(String value) throws IOException {
        if (value.equals("Financial Statement")) return FINANCIAL_STATEMENT;
        if (value.equals("Tax Assessment")) return TAX_ASSESSMENT;
        if (value.equals("Tax Return")) return TAX_RETURN;
        throw new IOException("Cannot deserialize ProofCodeList");
    }
}
