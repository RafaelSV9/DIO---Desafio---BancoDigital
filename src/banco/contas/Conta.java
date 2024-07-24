package banco.contas;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public void transferir(double valor, Conta destino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
        destino.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void imprimirExtrato() {
        System.out.printf("Agência: %d, Conta: %d, Saldo: %.2f%n", agencia, numeroConta, saldo);
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numeroConta=" + numeroConta + "]";
    }
}
