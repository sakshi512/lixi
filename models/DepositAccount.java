package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DepositAccount {
    private YesNoList alreadyExists;
    private String uniqueID;
    private String xDepositAccount;
    private Overdraft overdraft;
}
