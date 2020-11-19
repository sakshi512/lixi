package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Recipient {
    private String description;
    private String lixiCode;
    private String routingCode;
    private RecipientSoftware software;
}
