package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RegistrationEvent {
    private String changeDateTime;
    private String changeNumber;
    private String ppsrTransactionID;
    private RegistrationEventTypeList type;
}
