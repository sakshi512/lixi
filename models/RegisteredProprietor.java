package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RegisteredProprietor {
    private YesNoList changeNameFormRequired;
    private String name;
    private String xRegisteredProprietor;
}
