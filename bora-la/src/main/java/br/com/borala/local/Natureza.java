package br.com.borala.local;

import java.time.LocalDate;

public class Natureza extends Local{
    private float distanciaCidade;
    private String itensRecomendados;
    private String guias;
    private LocalDate agendaGuia;
    private float ValorGuia;

    public Natureza(long id, String nome, String endereco, String cidade, String estado,
                    String descricao, LocalDate horaFunc, String telefone,
                    float distanciaCidade, String itensRecomendados, String guias,
                    LocalDate agendaGuia, float valorGuia) {
        super(id, nome, endereco, cidade, estado, descricao, horaFunc, telefone);
        this.distanciaCidade = distanciaCidade;
        this.itensRecomendados = itensRecomendados;
        this.guias = guias;
        this.agendaGuia = agendaGuia;
        ValorGuia = valorGuia;
    }

    public float getDistanciaCidade() {
        return distanciaCidade;
    }

    public void setDistanciaCidade(float distanciaCidade) {
        this.distanciaCidade = distanciaCidade;
    }

    public String getItensRecomendados() {
        return itensRecomendados;
    }

    public void setItensRecomendados(String itensRecomendados) {
        this.itensRecomendados = itensRecomendados;
    }

    public String getGuias() {
        return guias;
    }

    public void setGuias(String guias) {
        this.guias = guias;
    }

    public LocalDate getAgendaGuia() {
        return agendaGuia;
    }

    public void setAgendaGuia(LocalDate agendaGuia) {
        this.agendaGuia = agendaGuia;
    }

    public float getValorGuia() {
        return ValorGuia;
    }

    public void setValorGuia(float valorGuia) {
        ValorGuia = valorGuia;
    }

    public void mostarDistancia(){
        //a implemetar
    }

    public void fazerAgendamento(LocalDate data){
        setAgendaGuia(data);
    }
}
