package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StatusNameApplicationInstructionsList {
    APPLICATION_RECEIVED, APPLICATION_REGISTERED, APPLICATION_SENT, APPLICATION_SETTLED, CANCELLED, CONDITIONALLY_APPROVED, DECLINED, INDICATIVELY_APPROVED, PRE_APPROVED, READY_FOR_SETTLEMENT, REFERRED_TO_ASSESSOR, REVERTED_TO_CAPTURE, UNCONDITIONALLY_APPROVED, WITHDRAWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICATION_RECEIVED: return "Application Received";
            case APPLICATION_REGISTERED: return "Application Registered";
            case APPLICATION_SENT: return "Application Sent";
            case APPLICATION_SETTLED: return "Application Settled";
            case CANCELLED: return "Cancelled";
            case CONDITIONALLY_APPROVED: return "Conditionally Approved";
            case DECLINED: return "Declined";
            case INDICATIVELY_APPROVED: return "Indicatively Approved";
            case PRE_APPROVED: return "PreApproved";
            case READY_FOR_SETTLEMENT: return "Ready for Settlement";
            case REFERRED_TO_ASSESSOR: return "Referred to Assessor";
            case REVERTED_TO_CAPTURE: return "Reverted to Capture";
            case UNCONDITIONALLY_APPROVED: return "Unconditionally Approved";
            case WITHDRAWN: return "Withdrawn";
        }
        return null;
    }

    @JsonCreator
    public static StatusNameApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Application Received")) return APPLICATION_RECEIVED;
        if (value.equals("Application Registered")) return APPLICATION_REGISTERED;
        if (value.equals("Application Sent")) return APPLICATION_SENT;
        if (value.equals("Application Settled")) return APPLICATION_SETTLED;
        if (value.equals("Cancelled")) return CANCELLED;
        if (value.equals("Conditionally Approved")) return CONDITIONALLY_APPROVED;
        if (value.equals("Declined")) return DECLINED;
        if (value.equals("Indicatively Approved")) return INDICATIVELY_APPROVED;
        if (value.equals("PreApproved")) return PRE_APPROVED;
        if (value.equals("Ready for Settlement")) return READY_FOR_SETTLEMENT;
        if (value.equals("Referred to Assessor")) return REFERRED_TO_ASSESSOR;
        if (value.equals("Reverted to Capture")) return REVERTED_TO_CAPTURE;
        if (value.equals("Unconditionally Approved")) return UNCONDITIONALLY_APPROVED;
        if (value.equals("Withdrawn")) return WITHDRAWN;
        throw new IOException("Cannot deserialize StatusNameApplicationInstructionsList");
    }
}
