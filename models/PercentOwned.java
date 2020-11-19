package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PercentOwned {
    private ProportionsList proportions;
    private List<PurpleOwner> owner;
}
