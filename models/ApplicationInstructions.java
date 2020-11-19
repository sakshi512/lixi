package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ApplicationInstructions {
    private Submit submit;
    private Update update;
}
