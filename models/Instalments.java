package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Instalments {
    private Double amountPerInstalment;
    private InstalmentsFrequencyList frequency;
    private YesNoList indexed;
    private Double indexRate;
    private Long numberOfInstalments;
}
