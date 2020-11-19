package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RealEstateAssetEncumbranceList {
    CAVEAT, CHARGE, COVENANT, EASEMENT, FI_FA, LAND_TAX_CHARGE, LEASE, MEMORIAL, MORTGAGE, NONE_DISCLOSED, NOT_KNOWN, OTHER, WARRANT, WRIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAVEAT: return "Caveat";
            case CHARGE: return "Charge";
            case COVENANT: return "Covenant";
            case EASEMENT: return "Easement";
            case FI_FA: return "FiFa";
            case LAND_TAX_CHARGE: return "Land Tax Charge";
            case LEASE: return "Lease";
            case MEMORIAL: return "Memorial";
            case MORTGAGE: return "Mortgage";
            case NONE_DISCLOSED: return "None Disclosed";
            case NOT_KNOWN: return "Not Known";
            case OTHER: return "Other";
            case WARRANT: return "Warrant";
            case WRIT: return "Writ";
        }
        return null;
    }

    @JsonCreator
    public static RealEstateAssetEncumbranceList forValue(String value) throws IOException {
        if (value.equals("Caveat")) return CAVEAT;
        if (value.equals("Charge")) return CHARGE;
        if (value.equals("Covenant")) return COVENANT;
        if (value.equals("Easement")) return EASEMENT;
        if (value.equals("FiFa")) return FI_FA;
        if (value.equals("Land Tax Charge")) return LAND_TAX_CHARGE;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("Memorial")) return MEMORIAL;
        if (value.equals("Mortgage")) return MORTGAGE;
        if (value.equals("None Disclosed")) return NONE_DISCLOSED;
        if (value.equals("Not Known")) return NOT_KNOWN;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Warrant")) return WARRANT;
        if (value.equals("Writ")) return WRIT;
        throw new IOException("Cannot deserialize RealEstateAssetEncumbranceList");
    }
}
