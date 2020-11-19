package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MmMonthList {
    THE_01, THE_02, THE_03, THE_04, THE_05, THE_06, THE_07, THE_08, THE_09, THE_10, THE_11, THE_12;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_01: return "01";
            case THE_02: return "02";
            case THE_03: return "03";
            case THE_04: return "04";
            case THE_05: return "05";
            case THE_06: return "06";
            case THE_07: return "07";
            case THE_08: return "08";
            case THE_09: return "09";
            case THE_10: return "10";
            case THE_11: return "11";
            case THE_12: return "12";
        }
        return null;
    }

    @JsonCreator
    public static MmMonthList forValue(String value) throws IOException {
        if (value.equals("01")) return THE_01;
        if (value.equals("02")) return THE_02;
        if (value.equals("03")) return THE_03;
        if (value.equals("04")) return THE_04;
        if (value.equals("05")) return THE_05;
        if (value.equals("06")) return THE_06;
        if (value.equals("07")) return THE_07;
        if (value.equals("08")) return THE_08;
        if (value.equals("09")) return THE_09;
        if (value.equals("10")) return THE_10;
        if (value.equals("11")) return THE_11;
        if (value.equals("12")) return THE_12;
        throw new IOException("Cannot deserialize MmMonthList");
    }
}
