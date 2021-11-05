package br.com.borala.usuario;

import br.com.borala.rota.Roteiro;

import java.time.LocalDate;

public abstract class Usuario {
    protected long id;
    protected String nome;
    protected LocalDate dataNasc;
    protected String sexo;
    protected String email;
    protected String endereco;
    protected String senha;
    protected String telefone;
    protected Roteiro roteiro;

    public Usuario(long id, String nome, LocalDate dataNasc, String sexo, String email,
                   String endereco, String senha, String telefone, Roteiro roteiro) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.telefone = telefone;
        this.roteiro = roteiro;
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Roteiro getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(Roteiro roteiro) {
        this.roteiro = roteiro;
    }

    public void alterarCadastro(String endereco, String senha, String telefone) {
        this.endereco = endereco;
        this.senha = senha;
        this.telefone = telefone;
    }


}
