package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PublisherSoftware {
    private String description;
    private String environment;
    private String lixiCode;
    private String name;
    private String technicalEmail;
    private String version;
}
