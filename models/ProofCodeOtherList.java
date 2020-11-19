package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProofCodeOtherList {
    LETTER_FROM_APPROPRIATE_BODY, LETTER_FROM_GOVERNMENT, TAX_RETURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LETTER_FROM_APPROPRIATE_BODY: return "Letter from Appropriate Body";
            case LETTER_FROM_GOVERNMENT: return "Letter from Government";
            case TAX_RETURN: return "Tax Return";
        }
        return null;
    }

    @JsonCreator
    public static ProofCodeOtherList forValue(String value) throws IOException {
        if (value.equals("Letter from Appropriate Body")) return LETTER_FROM_APPROPRIATE_BODY;
        if (value.equals("Letter from Government")) return LETTER_FROM_GOVERNMENT;
        if (value.equals("Tax Return")) return TAX_RETURN;
        throw new IOException("Cannot deserialize ProofCodeOtherList");
    }
}
