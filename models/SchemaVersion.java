package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SchemaVersion {
    private String guidebookCode;
    private String guidebookName;
    private String guidebookVersion;
    private String lixiCustomVersion;
    private LIXITransactionType lixiTransactionType;
    private LIXIVersion lixiVersion;
}
