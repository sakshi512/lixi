package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Content {
    private Application application;
    private NeedsAnalysis needsAnalysis;
    private List<StatementOfPosition> statementOfPosition;
}
