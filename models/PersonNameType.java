package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PersonNameType {
    private String firstName;
    private String knownAs;
    private String middleNames;
    private NameTitleList nameTitle;
    private String otherNameTitle;
    private String surname;
}
