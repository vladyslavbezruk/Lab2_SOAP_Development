package com.lab2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Реалізація інтерфейсу веб сервісу для конвертації валют
@WebService(endpointInterface = "com.lab2.CurrencyService", targetNamespace = "http://lab2.com/")
public class CurrencyServiceImpl implements CurrencyService {

    @WebMethod
    public double getExchangeRate(
            @WebParam(name = "fromCurrency") String fromCurrency, // Код валюти джерела
            @WebParam(name = "toCurrency") String toCurrency      // Код валюти призначення
    ) {
        // Обробка стандартних валютних пар
        if ("USD".equalsIgnoreCase(fromCurrency) && "EUR".equalsIgnoreCase(toCurrency)) {
            return 0.88; // Курс обміну USD -> EUR
        } else if ("EUR".equalsIgnoreCase(fromCurrency) && "USD".equalsIgnoreCase(toCurrency)) {
            return 1 / 0.88; // Курс обміну EUR -> USD
        } else if ("USD".equalsIgnoreCase(fromCurrency) && "UAH".equalsIgnoreCase(toCurrency)) {
            return 41.43; // Курс обміну USD -> UAH
        } else if ("UAH".equalsIgnoreCase(fromCurrency) && "USD".equalsIgnoreCase(toCurrency)) {
            return 1 / 41.43; // Курс обміну UAH -> USD
        } else {
            // Вивід повідомлення якщо пара валют невідома
            System.out.println("Unknown currency pair!");
            return -1; // Значення помилки
        }
    }
}