package br.com.borala.local;

import java.time.LocalDate;
import java.util.ArrayList;

public class Local {
    protected long id;
    protected String nome;
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected float avaliacao;
    protected int numeroDeAvaliacao;
    protected int avaliacaoTotal;
    protected String descricao;
    protected LocalDate horaFunc;
    public enum Tipo {GASTRONOMICO, CULTURAL, NATUREZA, NOTURNO};
    ArrayList<String> comentarios = new ArrayList<>();
    protected long numVisitas;
    protected String telefone;

    public Local(long id, String nome, String endereco, String cidade, String estado, String descricao,
                 LocalDate horaFunc, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.avaliacao = 0;
        this.descricao = descricao;
        this.horaFunc = horaFunc;
        this.numVisitas = 0;
        this.telefone = telefone;
        this.numeroDeAvaliacao = 0;
        this.avaliacaoTotal = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getHoraFunc() {
        return horaFunc;
    }

    public void setHoraFunc(LocalDate horaFunc) {
        this.horaFunc = horaFunc;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", avaliacao=" + avaliacao +
                ", numeroDeAvaliacao=" + numeroDeAvaliacao +
                ", avaliacaoTotal=" + avaliacaoTotal +
                ", descricao='" + descricao + '\'' +
                ", horaFunc=" + horaFunc +
                ", comentarios=" + comentarios +
                ", numVisitas=" + numVisitas +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public long getNumVisitas() {
        return numVisitas;
    }

    public void setNumVisitas(long numVisitas) {
        this.numVisitas = numVisitas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void avaliar(float nota){
        numeroDeAvaliacao++;
        this.setAvaliacao((avaliacaoTotal + nota) / numeroDeAvaliacao);
    }

    public void comentar(String comentario){
        this.comentarios.add(comentario);
    }

    public void denunciar(){
        //a implementar
    }

    public void mostrarInformacaoCompleta(){
        //a implementar
    }

}
