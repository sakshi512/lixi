package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Features {
    private YesNoList cardUpgrade;
    private Double limit;
    private String loyaltyProgramNumber;
    private String productCategory;
    private String productName;
    private String xPrimaryCardholder;
    private List<FeaturesSupplementaryCardholder> supplementaryCardholder;
}
