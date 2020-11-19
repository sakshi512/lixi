package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PreviousName {
    private String firstName;
    private String middleNames;
    private String nameChangeReason;
    private NameTitleList nameTitle;
    private String surname;
}
