package com.example.exchangeRate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class ExchangeRequest {
    @NotNull(message = "amount is required")
    @PositiveOrZero(message = "amount must be greater than or equal to 0")
    private double amount;
    @NotNull (message = "currencyFrom is required") @NotEmpty(message = "currencyFrom is empty")
    private String currencyFrom;
    @NotNull (message = "currencyTo is required") @NotEmpty(message = "currencyTo is empty")
    private String currencyTo;
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCurrencyFrom() {
        return currencyFrom;
    }
    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }
    public String getCurrencyTo() {
        return currencyTo;
    }
    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    // Getters y Setters
    
}