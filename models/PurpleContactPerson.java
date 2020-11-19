package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleContactPerson {
    private String firstName;
    private NameTitleList nameTitle;
    private String role;
    private String surname;
}
