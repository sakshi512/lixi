package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Instructions {
    private ApplicationInstructions applicationInstructions;
    private List<ErrorInstruction> errorInstructions;
}
