package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DetailedComment {
    private String contextDescription;
    private String createdDate;
    private String uniqueID;
    private String xAuthor;
    private String xContext;
    private Comment comment;
}
