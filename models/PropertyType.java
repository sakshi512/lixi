package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PropertyType {
    private String categoryTypeName;
    private String propertyTypeCode;
    private String propertyTypeName;
}
