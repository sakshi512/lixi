package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Result {
    private String manualCheckDetails;
    private YesNoList referForManualCheck;
}
