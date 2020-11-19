package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FunderList {
    ADELAIDE_BANK, ADVANTEDGE, BC_SECURITIES, BENDIGO_BANK, FIRSTMAC, LA_TROBE, MACQUARIE, ORIGIN, PEPPER, RED_ZED, RESIMAC, SINTEX;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADELAIDE_BANK: return "Adelaide Bank";
            case ADVANTEDGE: return "Advantedge";
            case BC_SECURITIES: return "BC Securities";
            case BENDIGO_BANK: return "Bendigo Bank";
            case FIRSTMAC: return "Firstmac";
            case LA_TROBE: return "LaTrobe";
            case MACQUARIE: return "Macquarie";
            case ORIGIN: return "Origin";
            case PEPPER: return "Pepper";
            case RED_ZED: return "RedZed";
            case RESIMAC: return "Resimac";
            case SINTEX: return "Sintex";
        }
        return null;
    }

    @JsonCreator
    public static FunderList forValue(String value) throws IOException {
        if (value.equals("Adelaide Bank")) return ADELAIDE_BANK;
        if (value.equals("Advantedge")) return ADVANTEDGE;
        if (value.equals("BC Securities")) return BC_SECURITIES;
        if (value.equals("Bendigo Bank")) return BENDIGO_BANK;
        if (value.equals("Firstmac")) return FIRSTMAC;
        if (value.equals("LaTrobe")) return LA_TROBE;
        if (value.equals("Macquarie")) return MACQUARIE;
        if (value.equals("Origin")) return ORIGIN;
        if (value.equals("Pepper")) return PEPPER;
        if (value.equals("RedZed")) return RED_ZED;
        if (value.equals("Resimac")) return RESIMAC;
        if (value.equals("Sintex")) return SINTEX;
        throw new IOException("Cannot deserialize FunderList");
    }
}
