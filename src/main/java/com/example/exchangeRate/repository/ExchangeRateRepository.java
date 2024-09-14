package com.example.exchangeRate.repository;

import com.example.exchangeRate.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    Optional<ExchangeRate> findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
