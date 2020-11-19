package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AnnotationTypeList {
    CODE, END_USER_MESSAGE, MESSAGE, TECHNICAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CODE: return "Code";
            case END_USER_MESSAGE: return "End User Message";
            case MESSAGE: return "Message";
            case TECHNICAL: return "Technical";
        }
        return null;
    }

    @JsonCreator
    public static AnnotationTypeList forValue(String value) throws IOException {
        if (value.equals("Code")) return CODE;
        if (value.equals("End User Message")) return END_USER_MESSAGE;
        if (value.equals("Message")) return MESSAGE;
        if (value.equals("Technical")) return TECHNICAL;
        throw new IOException("Cannot deserialize AnnotationTypeList");
    }
}
