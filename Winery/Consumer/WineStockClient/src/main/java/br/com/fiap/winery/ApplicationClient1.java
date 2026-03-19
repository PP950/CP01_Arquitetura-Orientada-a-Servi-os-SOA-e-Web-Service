package br.com.fiap.winery;


import br.com.fiap3esph.stubclasses.WineStockServiceImplementation;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient1 {

    String WSDL = "http://localhost:8085/WineStockService?wsdl";

    URL url = new URL(WSDL);

    QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

    Service service = Service.create(url, qName);

     WineStockServiceImplementation wineStockService = service.getPort(WineStockServiceImplementation .class);

    String menu = wineStockService.getMenu();
    public ApplicationClient1() throws MalformedURLException {
        System.out.println(menu);
    }

    public static void main(String[] args) throws MalformedURLException {
        new ApplicationClient1();
    }
}
