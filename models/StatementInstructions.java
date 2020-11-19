package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class StatementInstructions {
    private List<NameOnStatement> nameOnStatement;
}
