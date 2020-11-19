package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ProductSet {
    private String lodgementReferenceNumber;
    private String uniqueID;
    private String xPrimaryApplicant;
    private ProductSetContact contact;
    private List<ProductSetProduct> product;
}
