package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ContributionFundsTypeList {
    CASH, DEPOSIT_PAID, EXISTING_EQUITY, FIRST_HOME_OWNER_GRANT, GENUINE_SAVINGS, GIFT, INHERITANCE, NET_PROCEEDS_FROM_SALE_OF_PROPERTY, OTHER, REDRAW, SALE_OF_NON_REAL_ESTATE_ASSET, SECURED_VISA, SUPERANNUATION, TERM_DEPOSIT, UNSECURED_BORROWING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASH: return "Cash";
            case DEPOSIT_PAID: return "Deposit Paid";
            case EXISTING_EQUITY: return "Existing Equity";
            case FIRST_HOME_OWNER_GRANT: return "First Home Owner Grant";
            case GENUINE_SAVINGS: return "Genuine Savings";
            case GIFT: return "Gift";
            case INHERITANCE: return "Inheritance";
            case NET_PROCEEDS_FROM_SALE_OF_PROPERTY: return "Net Proceeds from Sale of Property";
            case OTHER: return "Other";
            case REDRAW: return "Redraw";
            case SALE_OF_NON_REAL_ESTATE_ASSET: return "Sale of Non Real Estate Asset";
            case SECURED_VISA: return "Secured VISA";
            case SUPERANNUATION: return "Superannuation";
            case TERM_DEPOSIT: return "Term Deposit";
            case UNSECURED_BORROWING: return "Unsecured Borrowing";
        }
        return null;
    }

    @JsonCreator
    public static ContributionFundsTypeList forValue(String value) throws IOException {
        if (value.equals("Cash")) return CASH;
        if (value.equals("Deposit Paid")) return DEPOSIT_PAID;
        if (value.equals("Existing Equity")) return EXISTING_EQUITY;
        if (value.equals("First Home Owner Grant")) return FIRST_HOME_OWNER_GRANT;
        if (value.equals("Genuine Savings")) return GENUINE_SAVINGS;
        if (value.equals("Gift")) return GIFT;
        if (value.equals("Inheritance")) return INHERITANCE;
        if (value.equals("Net Proceeds from Sale of Property")) return NET_PROCEEDS_FROM_SALE_OF_PROPERTY;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Redraw")) return REDRAW;
        if (value.equals("Sale of Non Real Estate Asset")) return SALE_OF_NON_REAL_ESTATE_ASSET;
        if (value.equals("Secured VISA")) return SECURED_VISA;
        if (value.equals("Superannuation")) return SUPERANNUATION;
        if (value.equals("Term Deposit")) return TERM_DEPOSIT;
        if (value.equals("Unsecured Borrowing")) return UNSECURED_BORROWING;
        throw new IOException("Cannot deserialize ContributionFundsTypeList");
    }
}
