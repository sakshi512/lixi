package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ErrorInstruction {
    private ErrorSourceList errorSource;
    private String errorSourceVersion;
    private ErrorInstructionsTypeList type;
    private String uniqueID;
    private String xPath;
    private List<Annotation> annotation;
}
