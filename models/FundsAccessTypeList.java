package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FundsAccessTypeList {
    LINE_OF_CREDIT, NONE, OFFSET, REDRAW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LINE_OF_CREDIT: return "Line of Credit";
            case NONE: return "None";
            case OFFSET: return "Offset";
            case REDRAW: return "Redraw";
        }
        return null;
    }

    @JsonCreator
    public static FundsAccessTypeList forValue(String value) throws IOException {
        if (value.equals("Line of Credit")) return LINE_OF_CREDIT;
        if (value.equals("None")) return NONE;
        if (value.equals("Offset")) return OFFSET;
        if (value.equals("Redraw")) return REDRAW;
        throw new IOException("Cannot deserialize FundsAccessTypeList");
    }
}
