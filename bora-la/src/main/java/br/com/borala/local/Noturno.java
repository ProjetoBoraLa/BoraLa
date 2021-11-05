package br.com.borala.local;

import java.time.LocalDate;

public class Noturno extends Gastronomico{
    private String musica;


    public Noturno(long id, String nome, String endereco, String cidade, String estado, String descricao,
                   LocalDate horaFunc, String telefone, String tipoAlimento, int estrelaRestaurante,
                   String musica) {
        super(id, nome, endereco, cidade, estado, descricao, horaFunc, telefone, tipoAlimento, estrelaRestaurante);
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
}
