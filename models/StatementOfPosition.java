package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class StatementOfPosition {
    private String date;
    private YesNoList isSigned;
    private String uniqueID;
    private List<StatementOfPositionApplicant> applicant;
}
