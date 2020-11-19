package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NextOfKin {
    private KinRelationshipList kinRelationship;
    private String xPerson;
}
