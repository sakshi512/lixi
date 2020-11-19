package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SalesChannelTypeList {
    BRANCH_NETWORK, CALL_CENTRE, MORTGAGE_BROKER, MORTGAGE_MANAGER, MORTGAGE_ORIGINATOR, ONLINE_CHANNEL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BRANCH_NETWORK: return "Branch Network";
            case CALL_CENTRE: return "Call Centre";
            case MORTGAGE_BROKER: return "Mortgage Broker";
            case MORTGAGE_MANAGER: return "Mortgage Manager";
            case MORTGAGE_ORIGINATOR: return "Mortgage Originator";
            case ONLINE_CHANNEL: return "Online Channel";
        }
        return null;
    }

    @JsonCreator
    public static SalesChannelTypeList forValue(String value) throws IOException {
        if (value.equals("Branch Network")) return BRANCH_NETWORK;
        if (value.equals("Call Centre")) return CALL_CENTRE;
        if (value.equals("Mortgage Broker")) return MORTGAGE_BROKER;
        if (value.equals("Mortgage Manager")) return MORTGAGE_MANAGER;
        if (value.equals("Mortgage Originator")) return MORTGAGE_ORIGINATOR;
        if (value.equals("Online Channel")) return ONLINE_CHANNEL;
        throw new IOException("Cannot deserialize SalesChannelTypeList");
    }
}
