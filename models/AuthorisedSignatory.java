package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AuthorisedSignatory {
    private String positionTitle;
    private String xSignatory;
}
