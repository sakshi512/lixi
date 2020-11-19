package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NonRealEstateAssetEncumbranceList {
    CHARGE, LEASE, NONE_DISCLOSED, NOT_KNOWN, OTHER, WARRANT, WRIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHARGE: return "Charge";
            case LEASE: return "Lease";
            case NONE_DISCLOSED: return "None Disclosed";
            case NOT_KNOWN: return "Not Known";
            case OTHER: return "Other";
            case WARRANT: return "Warrant";
            case WRIT: return "Writ";
        }
        return null;
    }

    @JsonCreator
    public static NonRealEstateAssetEncumbranceList forValue(String value) throws IOException {
        if (value.equals("Charge")) return CHARGE;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("None Disclosed")) return NONE_DISCLOSED;
        if (value.equals("Not Known")) return NOT_KNOWN;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Warrant")) return WARRANT;
        if (value.equals("Writ")) return WRIT;
        throw new IOException("Cannot deserialize NonRealEstateAssetEncumbranceList");
    }
}
