package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Introducer {
    private String companyName;
    private String contactName;
    private String introducerID;
}
