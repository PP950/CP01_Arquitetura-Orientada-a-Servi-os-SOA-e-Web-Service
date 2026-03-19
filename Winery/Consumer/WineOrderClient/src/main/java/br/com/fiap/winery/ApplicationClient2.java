package br.com.fiap.winery;

import br.com.fiap3esph.stubclasses.WineStockServiceImplementation;
import br.com.fiap3esph.stubclasses.WineWarningServiceImplementation;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    String WSDL = "http://localhost:8085/WineStockService?wsdl";
    String WSDL2 = "http://localhost:8086/WineWarningService?wsdl";

    URL url = new URL(WSDL);
    URL url2 = new URL(WSDL2);

    QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
    QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");


    Service service = Service.create(url, qName);
    Service service2 = Service.create(url2, qName2);

    WineStockServiceImplementation wineStockService = service.getPort(WineStockServiceImplementation.class);
    WineWarningServiceImplementation wineWarningService = service2.getPort(WineWarningServiceImplementation.class);

    String order = wineStockService.placeOrder("Malbec", 3);
    String warn =  wineWarningService.sendWarn();

    public ApplicationClient2() throws MalformedURLException {
        System.out.println("Resposta do Pedido: " + order);

        System.out.println("Mensagem de Aviso: " + warn);
    }

    public static void main(String[] args) throws MalformedURLException {
        new ApplicationClient2();
    }
}
