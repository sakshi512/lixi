package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum KinRelationshipList {
    CHILD, FRIEND, GRANDPARENT, OTHER_RELATIVE, PARENT, SIBLING, SPOUSE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHILD: return "Child";
            case FRIEND: return "Friend";
            case GRANDPARENT: return "Grandparent";
            case OTHER_RELATIVE: return "Other Relative";
            case PARENT: return "Parent";
            case SIBLING: return "Sibling";
            case SPOUSE: return "Spouse";
        }
        return null;
    }

    @JsonCreator
    public static KinRelationshipList forValue(String value) throws IOException {
        if (value.equals("Child")) return CHILD;
        if (value.equals("Friend")) return FRIEND;
        if (value.equals("Grandparent")) return GRANDPARENT;
        if (value.equals("Other Relative")) return OTHER_RELATIVE;
        if (value.equals("Parent")) return PARENT;
        if (value.equals("Sibling")) return SIBLING;
        if (value.equals("Spouse")) return SPOUSE;
        throw new IOException("Cannot deserialize KinRelationshipList");
    }
}
