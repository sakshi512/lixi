package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DocumentationInstructionsType {
    private DocumentationInstructionsMethodList method;
    private SendDocumentsToList sendDocumentsTo;
    private String xDeliverTo;
    private String xNominatedAuthority;
}
