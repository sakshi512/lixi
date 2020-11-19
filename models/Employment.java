package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Employment {
    private ForeignEmployed foreignEmployed;
    private NotEmployed notEmployed;
    private Payg payg;
    private SelfEmployed selfEmployed;
}
