package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Will {
    private String xExecutor;
    private String xWillHeldBy;
}
