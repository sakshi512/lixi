package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class SplitAccount {
    private String actionDate;
    private List<Account> account;
}
