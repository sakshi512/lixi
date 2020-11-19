package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VariationTypeList {
    ADD_BORROWER, ADD_GUARANTEE, ADD_GUARANTEE_SECURITY, ADD_GUARANTOR, ADD_SECURITY, BALANCE_INCREASE, CHANGE_LOAN_TERM, CHANGE_REPAYMENT_AMOUNT, CHANGE_REPAYMENT_FREQUENCY, CHANGE_REPAYMENT_TYPE, CLOSE_ACCOUNT, INTEREST_RATE_DISCOUNT, LENDING_GUARANTEE_LIMIT_DECREASE, LENDING_GUARANTEE_LIMIT_INCREASE, LIMIT_INCREASE, REDUCE_BALANCE, REDUCE_LIMIT, RELEASE_GUARANTEE, RELEASE_GUARANTEE_SECURITY, RELEASE_GUARANTOR, RELEASE_SECURITY, REMOVE_BORROWER, SPLIT_ACCOUNT, SUBSTITUTE_GUARANTEE_SECURITY, SUBSTITUTE_SECURITY, SWITCH_PRODUCT, UPDATE_PARTY_DETAILS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADD_BORROWER: return "Add Borrower";
            case ADD_GUARANTEE: return "Add Guarantee";
            case ADD_GUARANTEE_SECURITY: return "Add Guarantee Security";
            case ADD_GUARANTOR: return "Add Guarantor";
            case ADD_SECURITY: return "Add Security";
            case BALANCE_INCREASE: return "Balance Increase";
            case CHANGE_LOAN_TERM: return "Change Loan Term";
            case CHANGE_REPAYMENT_AMOUNT: return "Change Repayment Amount";
            case CHANGE_REPAYMENT_FREQUENCY: return "Change Repayment Frequency";
            case CHANGE_REPAYMENT_TYPE: return "Change Repayment Type";
            case CLOSE_ACCOUNT: return "Close Account";
            case INTEREST_RATE_DISCOUNT: return "Interest Rate Discount";
            case LENDING_GUARANTEE_LIMIT_DECREASE: return "Lending Guarantee Limit Decrease";
            case LENDING_GUARANTEE_LIMIT_INCREASE: return "Lending Guarantee Limit Increase";
            case LIMIT_INCREASE: return "Limit Increase";
            case REDUCE_BALANCE: return "Reduce Balance";
            case REDUCE_LIMIT: return "Reduce Limit";
            case RELEASE_GUARANTEE: return "Release Guarantee";
            case RELEASE_GUARANTEE_SECURITY: return "Release Guarantee Security";
            case RELEASE_GUARANTOR: return "Release Guarantor";
            case RELEASE_SECURITY: return "Release Security";
            case REMOVE_BORROWER: return "Remove Borrower";
            case SPLIT_ACCOUNT: return "Split Account";
            case SUBSTITUTE_GUARANTEE_SECURITY: return "Substitute Guarantee Security";
            case SUBSTITUTE_SECURITY: return "Substitute Security";
            case SWITCH_PRODUCT: return "Switch Product";
            case UPDATE_PARTY_DETAILS: return "Update Party Details";
        }
        return null;
    }

    @JsonCreator
    public static VariationTypeList forValue(String value) throws IOException {
        if (value.equals("Add Borrower")) return ADD_BORROWER;
        if (value.equals("Add Guarantee")) return ADD_GUARANTEE;
        if (value.equals("Add Guarantee Security")) return ADD_GUARANTEE_SECURITY;
        if (value.equals("Add Guarantor")) return ADD_GUARANTOR;
        if (value.equals("Add Security")) return ADD_SECURITY;
        if (value.equals("Balance Increase")) return BALANCE_INCREASE;
        if (value.equals("Change Loan Term")) return CHANGE_LOAN_TERM;
        if (value.equals("Change Repayment Amount")) return CHANGE_REPAYMENT_AMOUNT;
        if (value.equals("Change Repayment Frequency")) return CHANGE_REPAYMENT_FREQUENCY;
        if (value.equals("Change Repayment Type")) return CHANGE_REPAYMENT_TYPE;
        if (value.equals("Close Account")) return CLOSE_ACCOUNT;
        if (value.equals("Interest Rate Discount")) return INTEREST_RATE_DISCOUNT;
        if (value.equals("Lending Guarantee Limit Decrease")) return LENDING_GUARANTEE_LIMIT_DECREASE;
        if (value.equals("Lending Guarantee Limit Increase")) return LENDING_GUARANTEE_LIMIT_INCREASE;
        if (value.equals("Limit Increase")) return LIMIT_INCREASE;
        if (value.equals("Reduce Balance")) return REDUCE_BALANCE;
        if (value.equals("Reduce Limit")) return REDUCE_LIMIT;
        if (value.equals("Release Guarantee")) return RELEASE_GUARANTEE;
        if (value.equals("Release Guarantee Security")) return RELEASE_GUARANTEE_SECURITY;
        if (value.equals("Release Guarantor")) return RELEASE_GUARANTOR;
        if (value.equals("Release Security")) return RELEASE_SECURITY;
        if (value.equals("Remove Borrower")) return REMOVE_BORROWER;
        if (value.equals("Split Account")) return SPLIT_ACCOUNT;
        if (value.equals("Substitute Guarantee Security")) return SUBSTITUTE_GUARANTEE_SECURITY;
        if (value.equals("Substitute Security")) return SUBSTITUTE_SECURITY;
        if (value.equals("Switch Product")) return SWITCH_PRODUCT;
        if (value.equals("Update Party Details")) return UPDATE_PARTY_DETAILS;
        throw new IOException("Cannot deserialize VariationTypeList");
    }
}
