package com.example.exchangeRate.service.impl;

import com.example.exchangeRate.dto.ExchangeResponse;
import com.example.exchangeRate.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.example.exchangeRate.model.ExchangeRate;
import com.example.exchangeRate.repository.ExchangeRateRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public ExchangeResponse applyExchangeRate(double amount, String from, String to) {
        ExchangeRate exchangeRate = exchangeRateRepository.findByCurrencyFromAndCurrencyTo(from, to)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Tipo de cambio no encontrado"));
        double convertedAmount = amount * exchangeRate.getRate();
        return new ExchangeResponse( amount, convertedAmount,from, to,exchangeRate.getRate());
    }

    public ExchangeRate updateExchangeRate(String from, String to, double rate) {
        ExchangeRate exchangeRate = exchangeRateRepository.findByCurrencyFromAndCurrencyTo(from, to)
            .orElse(new ExchangeRate());
        exchangeRate.setCurrencyFrom(from);
        exchangeRate.setCurrencyTo(to);
        exchangeRate.setRate(rate);
        return exchangeRateRepository.save(exchangeRate);
    }
}
