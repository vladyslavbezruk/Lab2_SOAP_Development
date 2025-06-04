package com.lab2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService // Позначає що це інтерфейс веб-сервісу
public interface CurrencyService {

    @WebMethod // Метод доступний через SOAP
    double getExchangeRate(String fromCurrency, String toCurrency);
}