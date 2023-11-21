package com.PadroesDeProjetos.api;

import java.time.LocalDate;

public class Reserva {

    private int idReserva;
    private String cliente;
    private String veiculo; //para criar a classe Veiculo futuramente
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double preco;

    public Reserva(int idReserva, String cliente, String veiculo, LocalDate dataInicio, LocalDate dataFim, double preco) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.preco = preco;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setId(int id) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
