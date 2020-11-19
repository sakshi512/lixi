package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PreferredContactCompanyList {
    EMAIL, OFFICE_PHONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMAIL: return "Email";
            case OFFICE_PHONE: return "Office Phone";
        }
        return null;
    }

    @JsonCreator
    public static PreferredContactCompanyList forValue(String value) throws IOException {
        if (value.equals("Email")) return EMAIL;
        if (value.equals("Office Phone")) return OFFICE_PHONE;
        throw new IOException("Cannot deserialize PreferredContactCompanyList");
    }
}
