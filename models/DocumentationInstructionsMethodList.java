package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DocumentationInstructionsMethodList {
    EMAIL, POST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMAIL: return "Email";
            case POST: return "Post";
        }
        return null;
    }

    @JsonCreator
    public static DocumentationInstructionsMethodList forValue(String value) throws IOException {
        if (value.equals("Email")) return EMAIL;
        if (value.equals("Post")) return POST;
        throw new IOException("Cannot deserialize DocumentationInstructionsMethodList");
    }
}
