package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Annotation {
    private String details;
    private AnnotationTypeList type;
    private String uniqueID;
}
