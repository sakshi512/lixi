package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ImportanceList {
    DON_T_WANT, IMPORTANT, NOT_IMPORTANT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DON_T_WANT: return "Don't Want";
            case IMPORTANT: return "Important";
            case NOT_IMPORTANT: return "Not Important";
        }
        return null;
    }

    @JsonCreator
    public static ImportanceList forValue(String value) throws IOException {
        if (value.equals("Don't Want")) return DON_T_WANT;
        if (value.equals("Important")) return IMPORTANT;
        if (value.equals("Not Important")) return NOT_IMPORTANT;
        throw new IOException("Cannot deserialize ImportanceList");
    }
}
