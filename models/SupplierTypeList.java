package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SupplierTypeList {
    LICENSED_DEALER, MANUFACTURER, OTHER, PRIVATE_SALE, RECOGNISED_SUPPLIER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LICENSED_DEALER: return "Licensed Dealer";
            case MANUFACTURER: return "Manufacturer";
            case OTHER: return "Other";
            case PRIVATE_SALE: return "Private Sale";
            case RECOGNISED_SUPPLIER: return "Recognised Supplier";
        }
        return null;
    }

    @JsonCreator
    public static SupplierTypeList forValue(String value) throws IOException {
        if (value.equals("Licensed Dealer")) return LICENSED_DEALER;
        if (value.equals("Manufacturer")) return MANUFACTURER;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Private Sale")) return PRIVATE_SALE;
        if (value.equals("Recognised Supplier")) return RECOGNISED_SUPPLIER;
        throw new IOException("Cannot deserialize SupplierTypeList");
    }
}
