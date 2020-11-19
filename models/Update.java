package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Update {
    private List<Event> event;
    private Status status;
}
