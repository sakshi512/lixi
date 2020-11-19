package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum IndependentAdviceTypeRequiredList {
    FINANCIAL_ADVICE, FINANCIAL_AND_LEGAL_ADVICE, LEGAL_ADVICE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FINANCIAL_ADVICE: return "Financial Advice";
            case FINANCIAL_AND_LEGAL_ADVICE: return "Financial and Legal Advice";
            case LEGAL_ADVICE: return "Legal Advice";
        }
        return null;
    }

    @JsonCreator
    public static IndependentAdviceTypeRequiredList forValue(String value) throws IOException {
        if (value.equals("Financial Advice")) return FINANCIAL_ADVICE;
        if (value.equals("Financial and Legal Advice")) return FINANCIAL_AND_LEGAL_ADVICE;
        if (value.equals("Legal Advice")) return LEGAL_ADVICE;
        throw new IOException("Cannot deserialize IndependentAdviceTypeRequiredList");
    }
}
