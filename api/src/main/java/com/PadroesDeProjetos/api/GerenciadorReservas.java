package com.PadroesDeProjetos.api;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas {

    private static GerenciadorReservas instancia;

    private List<Reserva> reservas;

    private GerenciadorReservas(){
        reservas = new ArrayList<>();
    }

    public static GerenciadorReservas getInstancia(){
        if (instancia == null){
            instancia = new GerenciadorReservas();
        }
        return instancia;
    }

    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("Reserva adicionada com sucesso! ID: "+ reserva.getIdReserva());
        imprimirDetalhesReserva(reserva);
    }

    public void imprimirDetalhesReserva(Reserva reserva){
        System.out.println("-- DETALHES DA RESERVA -----------------------------------------------");
        System.out.println("ID: " + reserva.getIdReserva());
        System.out.println("Nome do Cliente: " + reserva.getCliente());
        System.out.println("Veículo reservado: " + reserva.getVeiculo());
        System.out.println("Data da retirada do veículo: " + reserva.getDataInicio());
        System.out.println("Data da devolução do veículo: " + reserva.getDataFim());
        System.out.println("Valor da reserva: R$ " + reserva.getPreco());
        System.out.println("----------------------------------------------------------------------");
    }

    public void listarReserva(){
        for (Reserva reserva : reservas){
            imprimirDetalhesReserva(reserva);
        }
    }

    public void cancelarReserva(int idReserva){
        boolean removido = reservas.removeIf(reserva -> reserva.getIdReserva() == idReserva);
        if (removido){
            System.out.println("Reserva cancelada com sucesso: ID "+ idReserva);
        } else {
            System.out.println("Reserva não localizada: ID " + idReserva);
        }
    }
}
