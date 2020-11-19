package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LixiPackage {
    private YesNoList productionData;
    private String uniqueID;
    private List<Attachment> attachment;
    private Content content;
    private Instructions instructions;
    private Publisher publisher;
    private List<Recipient> recipient;
    private SchemaVersion schemaVersion;
    private TransformMetadata transformMetadata;
}
