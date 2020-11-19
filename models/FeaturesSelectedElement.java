package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class FeaturesSelectedElement {
    private YesNoList chequeBook;
    private YesNoList creditCard;
    private YesNoList debitCard;
    private YesNoList depositBook;
    private YesNoList eftposCard;
    private YesNoList statementEmailDelivery;
    private YesNoList statementPaperDelivery;
    private String xApplicant;
    private List<PurpleExtraFeature> extraFeature;
}
