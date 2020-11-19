package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class VendorTaxInvoiceType {
    private String invoiceNumber;
    private String taxInvoiceDate;
    private String uniqueID;
    private String xDeliverTo;
    private String xPurchaser;
    private String xVendor;
    private List<Asset> asset;
}
