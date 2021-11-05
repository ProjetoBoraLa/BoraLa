package br.com.borala.usuario;

import br.com.borala.rota.Roteiro;

import java.time.LocalDate;

public class PessoaJuridica extends Usuario{
    public String cnpj;

    public PessoaJuridica(long id, String nome, LocalDate dataNasc, String sexo, String email,
                          String endereco, String senha, String telefone, Roteiro roteiro, String cnpj) {
        super(id, nome, dataNasc, sexo, email, endereco, senha, telefone, roteiro);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
