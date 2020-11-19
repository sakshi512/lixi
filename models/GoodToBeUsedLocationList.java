package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GoodToBeUsedLocationList {
    ON_BUSINESS_PREMISES, ON_SITE, ON_SITE_DAILY_RETURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ON_BUSINESS_PREMISES: return "On Business Premises";
            case ON_SITE: return "On Site";
            case ON_SITE_DAILY_RETURN: return "On Site Daily Return";
        }
        return null;
    }

    @JsonCreator
    public static GoodToBeUsedLocationList forValue(String value) throws IOException {
        if (value.equals("On Business Premises")) return ON_BUSINESS_PREMISES;
        if (value.equals("On Site")) return ON_SITE;
        if (value.equals("On Site Daily Return")) return ON_SITE_DAILY_RETURN;
        throw new IOException("Cannot deserialize GoodToBeUsedLocationList");
    }
}
