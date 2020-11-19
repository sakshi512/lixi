package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AuStateList {
    ACT, NSW, NT, QLD, SA, TAS, VIC, WA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACT: return "ACT";
            case NSW: return "NSW";
            case NT: return "NT";
            case QLD: return "QLD";
            case SA: return "SA";
            case TAS: return "TAS";
            case VIC: return "VIC";
            case WA: return "WA";
        }
        return null;
    }

    @JsonCreator
    public static AuStateList forValue(String value) throws IOException {
        if (value.equals("ACT")) return ACT;
        if (value.equals("NSW")) return NSW;
        if (value.equals("NT")) return NT;
        if (value.equals("QLD")) return QLD;
        if (value.equals("SA")) return SA;
        if (value.equals("TAS")) return TAS;
        if (value.equals("VIC")) return VIC;
        if (value.equals("WA")) return WA;
        throw new IOException("Cannot deserialize AuStateList");
    }
}
