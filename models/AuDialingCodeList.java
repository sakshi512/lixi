package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AuDialingCodeList {
    THE_02, THE_03, THE_04, THE_05, THE_07, THE_08, THE_13, THE_1300, THE_180, THE_1800;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_02: return "02";
            case THE_03: return "03";
            case THE_04: return "04";
            case THE_05: return "05";
            case THE_07: return "07";
            case THE_08: return "08";
            case THE_13: return "13";
            case THE_1300: return "1300";
            case THE_180: return "180";
            case THE_1800: return "1800";
        }
        return null;
    }

    @JsonCreator
    public static AuDialingCodeList forValue(String value) throws IOException {
        if (value.equals("02")) return THE_02;
        if (value.equals("03")) return THE_03;
        if (value.equals("04")) return THE_04;
        if (value.equals("05")) return THE_05;
        if (value.equals("07")) return THE_07;
        if (value.equals("08")) return THE_08;
        if (value.equals("13")) return THE_13;
        if (value.equals("1300")) return THE_1300;
        if (value.equals("180")) return THE_180;
        if (value.equals("1800")) return THE_1800;
        throw new IOException("Cannot deserialize AuDialingCodeList");
    }
}
