package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LoanDetailFeaturesSelected {
    private YesNoList chequeBook;
    private YesNoList creditCard;
    private YesNoList debitCard;
    private YesNoList depositBook;
    private YesNoList holidayLeave;
    private YesNoList offset;
    private Double offsetPercentage;
    private YesNoList parentalLeave;
    private YesNoList partialOffset;
    private YesNoList portability;
    private YesNoList progressiveDraw;
    private YesNoList rateLock;
    private YesNoList redraw;
    private YesNoList splitLoan;
    private List<TentacledExtraFeature> extraFeature;
    private List<FluffyOffsetAccount> offsetAccount;
}
