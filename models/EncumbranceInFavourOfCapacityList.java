package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EncumbranceInFavourOfCapacityList {
    ASSET_HELD_IN_OWN_RIGHT_AND_ON_BEHALF_OF_TRUST, LIMITED_TO_PARTICULAR_PROPERTY_OR_ASSET, OWN_RIGHT_ONLY, PARTNERSHIP, TRUST_ASSETS_ONLY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ASSET_HELD_IN_OWN_RIGHT_AND_ON_BEHALF_OF_TRUST: return "Asset Held in Own Right and on Behalf of Trust";
            case LIMITED_TO_PARTICULAR_PROPERTY_OR_ASSET: return "Limited to Particular Property or Asset";
            case OWN_RIGHT_ONLY: return "Own Right Only";
            case PARTNERSHIP: return "Partnership";
            case TRUST_ASSETS_ONLY: return "Trust Assets Only";
        }
        return null;
    }

    @JsonCreator
    public static EncumbranceInFavourOfCapacityList forValue(String value) throws IOException {
        if (value.equals("Asset Held in Own Right and on Behalf of Trust")) return ASSET_HELD_IN_OWN_RIGHT_AND_ON_BEHALF_OF_TRUST;
        if (value.equals("Limited to Particular Property or Asset")) return LIMITED_TO_PARTICULAR_PROPERTY_OR_ASSET;
        if (value.equals("Own Right Only")) return OWN_RIGHT_ONLY;
        if (value.equals("Partnership")) return PARTNERSHIP;
        if (value.equals("Trust Assets Only")) return TRUST_ASSETS_ONLY;
        throw new IOException("Cannot deserialize EncumbranceInFavourOfCapacityList");
    }
}
