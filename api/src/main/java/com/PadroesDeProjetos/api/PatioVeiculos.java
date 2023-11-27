package com.PadroesDeProjetos.api;

public class PatioVeiculos {

    public Veiculo buscarVeiculos(String tipo) {
        if (tipo.equals("carro")) {
            return new Carro();
        } else if (tipo.equals("van")) {
            return new Van();
        } else if (tipo.equals("moto")) {
            return new Moto();
        } else if (tipo.equals("caminhonete")) {
            return new Caminhonete();
        } else {
            throw new IllegalArgumentException("Tipo de veículo não disponível.");
        }
    }


}

