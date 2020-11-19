package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Dependant {
    private Long age;
    private String dateOfBirth;
    private String name;
    private String uniqueID;
    private List<FinancialProvider> financialProvider;
}
