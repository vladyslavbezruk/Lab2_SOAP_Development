package com.lab2;

import jakarta.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        // Публікуємо веб-сервіс за вказаною URL
        Endpoint.publish("http://localhost:8080/soap/CurrencyService", new CurrencyServiceImpl());
        System.out.println("SOAP веб-сервіс запущено за адресою http://localhost:8080/soap/CurrencyService");
    }
}
