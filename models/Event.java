package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Event {
    private String dateTime;
    private String details;
    private EventNameApplicationInstructionsList name;
    private String uniqueID;
}
