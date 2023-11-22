package com.PadroesDeProjetos.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private int idReserva;
    private String cliente;
    private Veiculo veiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double preco;

    public Reserva(int idReserva, String cliente, Veiculo veiculo, LocalDate dataInicio, LocalDate dataFim) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.preco = calcularValorTotalDiaria(veiculo, dataInicio, dataFim);
    }

    private double calcularValorTotalDiaria(Veiculo veiculo, LocalDate dataInicio, LocalDate dataFim){
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return dias * veiculo.getPrecoDiaria();
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
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
