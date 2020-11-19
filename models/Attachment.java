package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Attachment {
    private String filename;
    private String uniqueID;
    private String uri;
    private InlineAttachment inlineAttachment;
}
