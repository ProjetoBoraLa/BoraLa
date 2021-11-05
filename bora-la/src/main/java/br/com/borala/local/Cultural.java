package br.com.borala.local;

import java.time.LocalDate;

public class Cultural extends Local{
    private float entrada;
    private String genero;

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Cultural(long id, String nome, String endereco, String cidade, String estado, String descricao,
                    LocalDate horaFunc, String telefone, float entrada, String genero) {
        super(id, nome, endereco, cidade, estado, descricao, horaFunc, telefone);
        this.entrada = entrada;
        this.genero = genero;
    }

    public void comprarEntrada(){
        //a implementar
    }
}
