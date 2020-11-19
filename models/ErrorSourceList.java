package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ErrorSourceList {
    DTD, PARSER, PROPRIETARY, SCHEMATRON, XSD, XSLT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DTD: return "DTD";
            case PARSER: return "Parser";
            case PROPRIETARY: return "Proprietary";
            case SCHEMATRON: return "Schematron";
            case XSD: return "XSD";
            case XSLT: return "XSLT";
        }
        return null;
    }

    @JsonCreator
    public static ErrorSourceList forValue(String value) throws IOException {
        if (value.equals("DTD")) return DTD;
        if (value.equals("Parser")) return PARSER;
        if (value.equals("Proprietary")) return PROPRIETARY;
        if (value.equals("Schematron")) return SCHEMATRON;
        if (value.equals("XSD")) return XSD;
        if (value.equals("XSLT")) return XSLT;
        throw new IOException("Cannot deserialize ErrorSourceList");
    }
}
