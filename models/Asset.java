package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Asset {
    private String assetDescription;
    private String deliveryDate;
    private Double depositPaid;
    private Double finalPosition;
    private GoodsDeliveryList goodsDelivery;
    private Double gstComponent;
    private Double nonTaxableAmount;
    private Double onCosts;
    private Double payout;
    private Double refund;
    private Double taxableAmountOfAsset;
    private Double totalCostOfAsset;
    private Double tradeIn;
    private String uniqueAssetIdentifier;
}
