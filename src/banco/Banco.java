package banco;

import java.util.ArrayList;
import java.util.List;
import banco.cliente.Cliente;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes); // Corrige para não usar streams se não estiver no Java 16+
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", clientes=" + clientes + "]";
    }
}
