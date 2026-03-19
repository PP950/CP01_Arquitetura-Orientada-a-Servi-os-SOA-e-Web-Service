package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        String url2 = "http://localhost:8086/WineWarningService";
        Endpoint.publish(url2, wineWarning);

        String url = "http://localhost:8085/WineStockService";
        Endpoint.publish(url, wineStock);

        System.out.println("Serviço publicado!");
    }
}
