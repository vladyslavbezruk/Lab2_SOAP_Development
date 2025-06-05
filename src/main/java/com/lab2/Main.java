package com.lab2;

import jakarta.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        // Публікація веб-сервісу за вказаною URL адресою
        Endpoint.publish("http://localhost:8080/soap/CurrencyService", new CurrencyServiceImpl());
        // Вивід повідомлення про успішний запуск сервісу
        System.out.println("SOAP веб-сервіс запущено за адресою http://localhost:8080/soap/CurrencyService");
    }
}