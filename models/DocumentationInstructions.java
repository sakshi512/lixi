package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DocumentationInstructions {
    private DocumentationInstructionsMethodList method;
    private SendDocumentsToPersonList sendDocumentsTo;
    private String xNominatedAuthority;
}
