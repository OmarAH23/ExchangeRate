package com.example.exchangeRate.controller;

import com.example.exchangeRate.service.ExchangeRateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.exchangeRate.model.ExchangeRate;
import com.example.exchangeRate.dto.ExchangeRequest;
import com.example.exchangeRate.dto.ExchangeRateUpdateRequest;
import com.example.exchangeRate.dto.ExchangeResponse;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/exchange")
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @PostMapping("/convert")
    public ResponseEntity<ExchangeResponse> convert(@Valid @RequestBody ExchangeRequest request) {
        ExchangeResponse exchange = exchangeRateService.applyExchangeRate(request.getAmount(),
                    request.getCurrencyFrom(), request.getCurrencyTo());
        return ResponseEntity.ok(exchange);
    }

    @PostMapping("/update")
    public ResponseEntity<ExchangeRate> updateExchangeRate(@Valid @RequestBody ExchangeRateUpdateRequest request) {
        ExchangeRate updatedRate = exchangeRateService.updateExchangeRate(request.getCurrencyFrom(),
                request.getCurrencyTo(), request.getRate());
        return ResponseEntity.ok(updatedRate);
    }
}
