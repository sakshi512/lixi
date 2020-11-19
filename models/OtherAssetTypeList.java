package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OtherAssetTypeList {
    ART_WORKS, GOOD_WILL_OF_BUSINESS, HOME_CONTENTS, INTELLECTUAL_PROPERTY, OTHER, STOCK_AND_INVENTORY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ART_WORKS: return "Art Works";
            case GOOD_WILL_OF_BUSINESS: return "Good Will of Business";
            case HOME_CONTENTS: return "Home Contents";
            case INTELLECTUAL_PROPERTY: return "Intellectual Property";
            case OTHER: return "Other";
            case STOCK_AND_INVENTORY: return "Stock and Inventory";
        }
        return null;
    }

    @JsonCreator
    public static OtherAssetTypeList forValue(String value) throws IOException {
        if (value.equals("Art Works")) return ART_WORKS;
        if (value.equals("Good Will of Business")) return GOOD_WILL_OF_BUSINESS;
        if (value.equals("Home Contents")) return HOME_CONTENTS;
        if (value.equals("Intellectual Property")) return INTELLECTUAL_PROPERTY;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Stock and Inventory")) return STOCK_AND_INVENTORY;
        throw new IOException("Cannot deserialize OtherAssetTypeList");
    }
}
