package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Identifier {
    private String attributeName;
    private String externalID;
    private String uniqueID;
    private String xContext;
}
