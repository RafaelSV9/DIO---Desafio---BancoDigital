import banco.Banco;
import banco.cliente.Cliente;
import banco.contas.Conta;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class App {
  public static void main(String[] args) throws Exception {

    Banco banco = new Banco("EasyMoney");
    
    Conta poupancaAna = new ContaPoupanca();
    Conta ccAna = new ContaCorrente();
    Conta poupancaWalassi = new ContaPoupanca();
    Conta ccWalassi = new ContaCorrente();
    
    Cliente walassi = new Cliente("Walassi", poupancaWalassi);
    Cliente walassiSilva = new Cliente("Walassi Silva", ccWalassi);
    Cliente ana = new Cliente("Ana", null);

    banco.addCliente(ana);
    banco.addCliente(walassi);
    banco.addCliente(walassiSilva);

    ana.setConta(ccAna);
    ana.setConta(poupancaAna);

    ccWalassi.depositar(2000);
    poupancaWalassi.depositar(50);

    ccAna.depositar(150);
    ccAna.transferir(50, walassi.getConta());

    ccAna.imprimirExtrato();
    poupancaAna.imprimirExtrato();

    ccWalassi.imprimirExtrato();
    poupancaWalassi.imprimirExtrato();

    var lista = banco.listarClientes();
    System.out.println(lista);
  }
}