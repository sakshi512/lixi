package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ResponsibleLendingType {
    private YesNoList anticipatedChanges;
    private List<Mitigant> mitigant;
    private List<SignificantChange> significantChange;
}
