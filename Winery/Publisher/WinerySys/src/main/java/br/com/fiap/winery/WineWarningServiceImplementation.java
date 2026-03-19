package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "")
public class WineWarningServiceImplementation implements WineWarningService {
    @Override
    public String sendWarn() {
        return "Estoque insuficiente";
    }
}
