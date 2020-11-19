package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SignatureType {
    private String date;
    private YesNoList electronicSignature;
    private Long rank;
    private String uniqueID;
    private String xSignatory;
    private Capacity capacity;
    private SignatureContact contact;
}
