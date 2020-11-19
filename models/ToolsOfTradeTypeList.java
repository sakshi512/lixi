package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ToolsOfTradeTypeList {
    CAMERA, OTHER, POWER_TOOLS, SURVEYING_EQUIPMENT, TOOLS_GENERAL, TOOLS_LASER_BEAM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAMERA: return "Camera";
            case OTHER: return "Other";
            case POWER_TOOLS: return "Power Tools";
            case SURVEYING_EQUIPMENT: return "Surveying Equipment";
            case TOOLS_GENERAL: return "Tools General";
            case TOOLS_LASER_BEAM: return "Tools - Laser Beam";
        }
        return null;
    }

    @JsonCreator
    public static ToolsOfTradeTypeList forValue(String value) throws IOException {
        if (value.equals("Camera")) return CAMERA;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Power Tools")) return POWER_TOOLS;
        if (value.equals("Surveying Equipment")) return SURVEYING_EQUIPMENT;
        if (value.equals("Tools General")) return TOOLS_GENERAL;
        if (value.equals("Tools - Laser Beam")) return TOOLS_LASER_BEAM;
        throw new IOException("Cannot deserialize ToolsOfTradeTypeList");
    }
}
