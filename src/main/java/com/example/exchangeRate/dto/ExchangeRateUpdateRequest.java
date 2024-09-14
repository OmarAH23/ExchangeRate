package com.example.exchangeRate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ExchangeRateUpdateRequest {
    @NotNull (message = "currencyFrom is required") @NotEmpty (message = "currencyFrom is empty")
    private String currencyFrom;
    @NotNull (message = "currencyTo is required") @NotEmpty (message = "currencyTo is empty")
    private String currencyTo;
    @NotNull(message = "rate is required")
    @Positive(message = "rate must be greater than 0")
    private double rate;
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
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Getters y Setters

    
}