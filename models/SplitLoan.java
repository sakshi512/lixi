package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class SplitLoan {
    private String uniqueID;
    private List<SplitLoanComponent> splitLoanComponent;
}
