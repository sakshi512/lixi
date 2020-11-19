package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProofCodeNotEmployedList {
    LETTER_FROM_APPROPRIATE_BODY, LETTER_FROM_GOVERNMENT, LETTER_FROM_SUPER_FUND, TAX_RETURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LETTER_FROM_APPROPRIATE_BODY: return "Letter from Appropriate Body";
            case LETTER_FROM_GOVERNMENT: return "Letter from Government";
            case LETTER_FROM_SUPER_FUND: return "Letter from Super Fund";
            case TAX_RETURN: return "Tax Return";
        }
        return null;
    }

    @JsonCreator
    public static ProofCodeNotEmployedList forValue(String value) throws IOException {
        if (value.equals("Letter from Appropriate Body")) return LETTER_FROM_APPROPRIATE_BODY;
        if (value.equals("Letter from Government")) return LETTER_FROM_GOVERNMENT;
        if (value.equals("Letter from Super Fund")) return LETTER_FROM_SUPER_FUND;
        if (value.equals("Tax Return")) return TAX_RETURN;
        throw new IOException("Cannot deserialize ProofCodeNotEmployedList");
    }
}
