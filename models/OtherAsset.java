package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherAsset {
    private String description;
    private OtherAssetTypeList type;
}
