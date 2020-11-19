package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleInFavourOf {
    private EncumbranceInFavourOfCapacityList capacity;
    private String name;
    private String xInFavourOf;
}
