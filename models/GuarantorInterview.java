package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class GuarantorInterview {
    private String date;
    private YesNoList isFaceToFace;
    private YesNoList isOnlyPersonPresent;
}
