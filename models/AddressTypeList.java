package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AddressTypeList {
    DX_BOX, NON_STANDARD, PO_BOX_OR_BAG, STANDARD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DX_BOX: return "DX Box";
            case NON_STANDARD: return "Non Standard";
            case PO_BOX_OR_BAG: return "PO Box or Bag";
            case STANDARD: return "Standard";
        }
        return null;
    }

    @JsonCreator
    public static AddressTypeList forValue(String value) throws IOException {
        if (value.equals("DX Box")) return DX_BOX;
        if (value.equals("Non Standard")) return NON_STANDARD;
        if (value.equals("PO Box or Bag")) return PO_BOX_OR_BAG;
        if (value.equals("Standard")) return STANDARD;
        throw new IOException("Cannot deserialize AddressTypeList");
    }
}
