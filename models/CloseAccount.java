package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CloseAccount {
    private YesNoList destroyCard;
    private Double payoutAmount;
}
