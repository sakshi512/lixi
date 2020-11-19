package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LicenceTypeList {
    ACL, CRN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACL: return "ACL";
            case CRN: return "CRN";
        }
        return null;
    }

    @JsonCreator
    public static LicenceTypeList forValue(String value) throws IOException {
        if (value.equals("ACL")) return ACL;
        if (value.equals("CRN")) return CRN;
        throw new IOException("Cannot deserialize LicenceTypeList");
    }
}
