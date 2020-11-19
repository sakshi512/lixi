package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FundsAccessTypeDetails {
    private FundsAccessTypeDetailsOffsetAccount offsetAccount;
    private Redraw redraw;
}
