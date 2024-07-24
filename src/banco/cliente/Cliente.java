package banco.cliente;

import banco.contas.Conta;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", conta=" + conta + "]";
    }
}
