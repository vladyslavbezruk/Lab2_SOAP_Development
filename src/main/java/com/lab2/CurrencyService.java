package com.lab2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Інтерфейс для веб-сервісу конвертації валют
@WebService(targetNamespace = "http://lab2.com/")
public interface CurrencyService {

    // Метод для отримання курсу обміну валют
    @WebMethod
    double getExchangeRate(
            @WebParam(name = "fromCurrency") String fromCurrency, // Код валюти джерела
            @WebParam(name = "toCurrency") String toCurrency      // Код валюти призначення
    );
}