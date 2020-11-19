package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TypeOfIncorporationList {
    INC, LTD, NL, PTY_LTD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INC: return "Inc";
            case LTD: return "Ltd";
            case NL: return "NL";
            case PTY_LTD: return "Pty Ltd";
        }
        return null;
    }

    @JsonCreator
    public static TypeOfIncorporationList forValue(String value) throws IOException {
        if (value.equals("Inc")) return INC;
        if (value.equals("Ltd")) return LTD;
        if (value.equals("NL")) return NL;
        if (value.equals("Pty Ltd")) return PTY_LTD;
        throw new IOException("Cannot deserialize TypeOfIncorporationList");
    }
}
