package br.com.borala.rota;

import br.com.borala.local.Local;

public class Roteiro {
    private long idRoteiro;
    private long idUsuario;
    private String nomeRoteiro;
    private long coordenadas;
    private String cidade;
    private Local local;

    public Roteiro(long idRoteiro, long usuario, String nomeRoteiro,
                   long coordenadas, String cidade, Local local) {
        this.idRoteiro = idRoteiro;
        this.idUsuario = usuario;
        this.nomeRoteiro = nomeRoteiro;
        this.coordenadas = coordenadas;
        this.cidade = cidade;
        this.local = local;
    }

    public long getIdRoteiro() {
        return idRoteiro;
    }

    public void setIdRoteiro(long idRoteiro) {
        this.idRoteiro = idRoteiro;
    }

    public long getUsuario() {
        return idUsuario;
    }

    public void setUsuario(long usuario) {
        this.idUsuario = usuario;
    }

    public String getNomeRoteiro() {
        return nomeRoteiro;
    }

    public void setNomeRoteiro(String nomeRoteiro) {
        this.nomeRoteiro = nomeRoteiro;
    }

    public long getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(long coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Roteiro gerarRoteiro(){
        //a implementar
        Roteiro rotaAtual = null;
        return rotaAtual;
    }

    public void salvarRoteiro(){
        //a implementar
    }
}
