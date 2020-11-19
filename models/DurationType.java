package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DurationType {
    private Long length;
    private DurationUnitsList units;
}
