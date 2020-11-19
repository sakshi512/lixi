package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PreferredContactPersonList {
    EMAIL, HOME_PHONE, MOBILE, WORK_PHONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMAIL: return "Email";
            case HOME_PHONE: return "Home Phone";
            case MOBILE: return "Mobile";
            case WORK_PHONE: return "Work Phone";
        }
        return null;
    }

    @JsonCreator
    public static PreferredContactPersonList forValue(String value) throws IOException {
        if (value.equals("Email")) return EMAIL;
        if (value.equals("Home Phone")) return HOME_PHONE;
        if (value.equals("Mobile")) return MOBILE;
        if (value.equals("Work Phone")) return WORK_PHONE;
        throw new IOException("Cannot deserialize PreferredContactPersonList");
    }
}
