package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Status {
    private StatusNameApplicationInstructionsList name;
    private String dateTime;
    private String details;
    private List<StatusCondition> condition;
    private List<Declined> declined;
    private List<PreApproved> preApproved;
}
