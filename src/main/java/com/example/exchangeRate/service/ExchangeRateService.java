package com.example.exchangeRate.service;

import com.example.exchangeRate.dto.ExchangeResponse;
import com.example.exchangeRate.model.ExchangeRate;

public interface ExchangeRateService {
    ExchangeResponse applyExchangeRate(double amount, String from, String to);
    ExchangeRate updateExchangeRate(String from, String to, double rate);
}
