import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nome;
    ArrayList<Cliente> clientes;
    List<Cliente> clientesPrimos = new ArrayList<>();
    List<Cliente> clientesImpar = new ArrayList<>();
    List<Cliente> clientesPar = new ArrayList<>();

    public Clinica(String nome) {
        this.nome = nome;
        clientes = new ArrayList<>();
    }

    public void addClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public void imprimirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    public boolean isPrimo(int idades) {
        if (idades < 2) {
            return false;
        }

        int contador = 0;
        for (int i = 1; i <= idades; i++) {
            if (idades % i == 0) {
                contador++;
            }

            if (contador > 2) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }

    public void filaDeEspera() {
        for (Cliente cliente : clientes) {
            if (isPrimo(cliente.getIdade())) {
                clientesPrimos.add(cliente);
            } else if (cliente.getIdade() % 2 != 0) {
                clientesImpar.add(cliente);
            } else {
                clientesPar.add(cliente);
            }

        }

        clientes.clear();
        clientes.addAll(clientesPrimos);
        clientes.addAll(clientesImpar);
        clientes.addAll(clientesPar);

        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

}
