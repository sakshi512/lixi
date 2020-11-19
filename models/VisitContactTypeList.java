package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VisitContactTypeList {
    APPLICANT, BUILDER, PROPERTY_AGENT, TENANT, VENDOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICANT: return "Applicant";
            case BUILDER: return "Builder";
            case PROPERTY_AGENT: return "Property Agent";
            case TENANT: return "Tenant";
            case VENDOR: return "Vendor";
        }
        return null;
    }

    @JsonCreator
    public static VisitContactTypeList forValue(String value) throws IOException {
        if (value.equals("Applicant")) return APPLICANT;
        if (value.equals("Builder")) return BUILDER;
        if (value.equals("Property Agent")) return PROPERTY_AGENT;
        if (value.equals("Tenant")) return TENANT;
        if (value.equals("Vendor")) return VENDOR;
        throw new IOException("Cannot deserialize VisitContactTypeList");
    }
}
