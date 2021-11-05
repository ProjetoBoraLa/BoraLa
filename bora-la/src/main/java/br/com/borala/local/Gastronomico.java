package br.com.borala.local;

import java.time.LocalDate;

public class Gastronomico extends Local{

    protected String tipoAlimento;
    protected LocalDate reserva;
    protected int estrelaRestaurante;
    protected String cardapio;

    public Gastronomico(long id, String nome, String endereco, String cidade, String estado,
                        String descricao, LocalDate horaFunc, String telefone, String tipoAlimento,
                        int estrelaRestaurante) {
        super(id, nome, endereco, cidade, estado, descricao, horaFunc, telefone);
        this.tipoAlimento = tipoAlimento;
        this.estrelaRestaurante = estrelaRestaurante;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public LocalDate getReserva() {
        return reserva;
    }

    public void setReserva(LocalDate reserva) {
        this.reserva = reserva;
    }

    public int getEstrelaRestaurante() {
        return estrelaRestaurante;
    }

    public void setEstrelaRestaurante(int estrelaRestaurante) {
        this.estrelaRestaurante = estrelaRestaurante;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public void fazerReserva(LocalDate reserva){
        setReserva(reserva);
    }

    public String verCardapio(){
        return getCardapio();
    }
}
