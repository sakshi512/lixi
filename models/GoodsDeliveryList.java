package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GoodsDeliveryList {
    ALREADY_DELIVERED, TO_BE_DELIVERED_ON_PAYMENT, WILL_BE_DELIVERED_ON_DATE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALREADY_DELIVERED: return "Already Delivered";
            case TO_BE_DELIVERED_ON_PAYMENT: return "To Be Delivered on Payment";
            case WILL_BE_DELIVERED_ON_DATE: return "Will Be Delivered on Date";
        }
        return null;
    }

    @JsonCreator
    public static GoodsDeliveryList forValue(String value) throws IOException {
        if (value.equals("Already Delivered")) return ALREADY_DELIVERED;
        if (value.equals("To Be Delivered on Payment")) return TO_BE_DELIVERED_ON_PAYMENT;
        if (value.equals("Will Be Delivered on Date")) return WILL_BE_DELIVERED_ON_DATE;
        throw new IOException("Cannot deserialize GoodsDeliveryList");
    }
}
