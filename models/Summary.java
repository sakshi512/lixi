package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Summary {
    private YesNoList allPartiesAgreeToElectronicSignature;
    private String feesDisclosureDate;
    private DocumentationInstructionsType documentationInstructions;
    private List<Fee> fee;
    private LoanToValuationRatio loanToValuationRatio;
    private List<ServiceabilityResult> serviceabilityResults;
    private List<SignatureType> signature;
}
