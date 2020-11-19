package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleOwner {
    private ApplicantTypeList ownerType;
    private Double percent;
    private String xParty;
}
