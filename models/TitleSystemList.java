package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TitleSystemList {
    COMPANY, OLD_LAW, QUALIFIED, TORRENS, UNREGISTERED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPANY: return "Company";
            case OLD_LAW: return "Old Law";
            case QUALIFIED: return "Qualified";
            case TORRENS: return "Torrens";
            case UNREGISTERED: return "Unregistered";
        }
        return null;
    }

    @JsonCreator
    public static TitleSystemList forValue(String value) throws IOException {
        if (value.equals("Company")) return COMPANY;
        if (value.equals("Old Law")) return OLD_LAW;
        if (value.equals("Qualified")) return QUALIFIED;
        if (value.equals("Torrens")) return TORRENS;
        if (value.equals("Unregistered")) return UNREGISTERED;
        throw new IOException("Cannot deserialize TitleSystemList");
    }
}
