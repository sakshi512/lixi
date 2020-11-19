package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PercentOwnedType {
    private ProportionsList proportions;
    private List<AccountOwnersOwner> owner;
}
