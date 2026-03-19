package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n" +
                "- Cabernet Sauvignon: Encorpado e frutado\n" +
                "- Merlot: Macio e aveludado\n" +
                "- Chardonnay: Branco seco e refrescante\n" +
                "- Malbec: Intenso com notas de ameixa";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido Confirmado! Você comprou " + quantity + " garrafa(s) de " + name + ".";
    }
}
