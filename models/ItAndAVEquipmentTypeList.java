package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ItAndAVEquipmentTypeList {
    AUDIO_VISUAL, CLIENT_COMPUTING, GAMING, HI_FI, NETWORK_INFRASTRUCTURE, OTHER, PERIPHERALS, PHOTOGRAPHY, POINT_OF_SALE_SYSTEM, PORTABLE_AUDIO, SECURITY_HARDWARE_AND_APPLIANCES, SERVER_COMPUTING, SOFTWARE, STORAGE_INFRASTRUCTURE, SURVEILLANCE_EQUIPMENT, TELEVISION, VIDEO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUDIO_VISUAL: return "Audio Visual";
            case CLIENT_COMPUTING: return "Client Computing";
            case GAMING: return "Gaming";
            case HI_FI: return "HiFi";
            case NETWORK_INFRASTRUCTURE: return "Network Infrastructure";
            case OTHER: return "Other";
            case PERIPHERALS: return "Peripherals";
            case PHOTOGRAPHY: return "Photography";
            case POINT_OF_SALE_SYSTEM: return "Point of Sale System";
            case PORTABLE_AUDIO: return "Portable Audio";
            case SECURITY_HARDWARE_AND_APPLIANCES: return "Security Hardware and Appliances";
            case SERVER_COMPUTING: return "Server Computing";
            case SOFTWARE: return "Software";
            case STORAGE_INFRASTRUCTURE: return "Storage Infrastructure";
            case SURVEILLANCE_EQUIPMENT: return "Surveillance Equipment";
            case TELEVISION: return "Television";
            case VIDEO: return "Video";
        }
        return null;
    }

    @JsonCreator
    public static ItAndAVEquipmentTypeList forValue(String value) throws IOException {
        if (value.equals("Audio Visual")) return AUDIO_VISUAL;
        if (value.equals("Client Computing")) return CLIENT_COMPUTING;
        if (value.equals("Gaming")) return GAMING;
        if (value.equals("HiFi")) return HI_FI;
        if (value.equals("Network Infrastructure")) return NETWORK_INFRASTRUCTURE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Peripherals")) return PERIPHERALS;
        if (value.equals("Photography")) return PHOTOGRAPHY;
        if (value.equals("Point of Sale System")) return POINT_OF_SALE_SYSTEM;
        if (value.equals("Portable Audio")) return PORTABLE_AUDIO;
        if (value.equals("Security Hardware and Appliances")) return SECURITY_HARDWARE_AND_APPLIANCES;
        if (value.equals("Server Computing")) return SERVER_COMPUTING;
        if (value.equals("Software")) return SOFTWARE;
        if (value.equals("Storage Infrastructure")) return STORAGE_INFRASTRUCTURE;
        if (value.equals("Surveillance Equipment")) return SURVEILLANCE_EQUIPMENT;
        if (value.equals("Television")) return TELEVISION;
        if (value.equals("Video")) return VIDEO;
        throw new IOException("Cannot deserialize ItAndAVEquipmentTypeList");
    }
}
