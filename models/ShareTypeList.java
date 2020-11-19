package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ShareTypeList {
    BEARER_SECURITIES, DEBENTURES, INSCRIBED_STOCK_CTH, INSCRIBED_STOCK_STATE, LISTED_SHARES, OPTIONS, UNLISTED_SHARES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEARER_SECURITIES: return "Bearer Securities";
            case DEBENTURES: return "Debentures";
            case INSCRIBED_STOCK_CTH: return "Inscribed Stock Cth";
            case INSCRIBED_STOCK_STATE: return "Inscribed Stock State";
            case LISTED_SHARES: return "Listed Shares";
            case OPTIONS: return "Options";
            case UNLISTED_SHARES: return "Unlisted Shares";
        }
        return null;
    }

    @JsonCreator
    public static ShareTypeList forValue(String value) throws IOException {
        if (value.equals("Bearer Securities")) return BEARER_SECURITIES;
        if (value.equals("Debentures")) return DEBENTURES;
        if (value.equals("Inscribed Stock Cth")) return INSCRIBED_STOCK_CTH;
        if (value.equals("Inscribed Stock State")) return INSCRIBED_STOCK_STATE;
        if (value.equals("Listed Shares")) return LISTED_SHARES;
        if (value.equals("Options")) return OPTIONS;
        if (value.equals("Unlisted Shares")) return UNLISTED_SHARES;
        throw new IOException("Cannot deserialize ShareTypeList");
    }
}
