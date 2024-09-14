package com.example.exchangeRate.dto;

public class ExchangeResponse {
    private double originalAmount;
    private double convertedAmount;
    private String currencyFrom;
    private String currencyTo;
    private double rate;

    public ExchangeResponse(double originalAmount, double convertedAmount, String currencyFrom,
                            String currencyTo,double rate) {
        this.originalAmount = originalAmount;
        this.convertedAmount = convertedAmount;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.rate = rate;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    // Getters


}