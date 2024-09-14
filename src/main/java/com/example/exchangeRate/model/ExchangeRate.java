package com.example.exchangeRate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currencyFrom;
    private String currencyTo;
    private double rate;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Getters y Setters
    
}
