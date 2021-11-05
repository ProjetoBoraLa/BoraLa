package br.com.borala.usuario;

import br.com.borala.rota.Roteiro;

import java.time.LocalDate;

public class PessoaFisica extends Usuario{
    private String cpf;

    public PessoaFisica(long id, String nome, LocalDate dataNasc, String sexo, String email,
                        String endereco, String senha, String telefone, Roteiro roteiro, String cpf) {
        super(id, nome, dataNasc, sexo, email, endereco, senha, telefone, roteiro);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
