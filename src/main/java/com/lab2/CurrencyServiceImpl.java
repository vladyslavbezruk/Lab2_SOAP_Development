package com.lab2;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.lab2.CurrencyService")
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        // Простий приклад курсів валют
        if ("USD".equalsIgnoreCase(fromCurrency) && "EUR".equalsIgnoreCase(toCurrency)) {
            return 0.88;
        } else if ("EUR".equalsIgnoreCase(fromCurrency) && "USD".equalsIgnoreCase(toCurrency)) {
            return 1 / 0.88;
        } else if ("USD".equalsIgnoreCase(fromCurrency) && "UAH".equalsIgnoreCase(toCurrency)) {
            return 41.43;
        } else if ("UAH".equalsIgnoreCase(fromCurrency) && "USD".equalsIgnoreCase(toCurrency)) {
            return 1 / 41.43;
        } else {
            return -1; // Повертаємо -1 для невідомих валют
        }
    }
}