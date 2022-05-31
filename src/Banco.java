import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
    private String nome;
    private List<Conta> listaContas;

    public Banco(String nome) {
        this.nome = nome;
        listaContas = new ArrayList<>();
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void adicionarConta(Conta conta) {
        this.listaContas.add(conta);
    }

    /**
     * @param tipoConta 'p' = poupança, 'c' = corrente
     */
    public List<Conta> getListaContasTipos(char tipoConta) {
        List<Conta> lcc = new ArrayList<>();
        for (Conta c : listaContas) {
            if (c.tipo == tipoConta) {
                lcc.add(c);
            }
        }
        return lcc;
    }

    /**
     * @param listaContas Use getListaContas ou getListaContasTipos
     */
    public void imprimirLista(List<Conta> listaContas) {
        for (Conta c : listaContas) {
            System.out.println("Titular: " + c.cliente.getNome());
            System.out.println("Agencia: " + c.agencia);
            System.out.println("Numero: " + c.contaNumero + "\n");
        }
    }

    public void imprimirClientes() {
        Set<String> sc = new HashSet<>();
        for (Conta c : this.listaContas) {
            if (sc.add(c.cliente.getCpf())) {
                System.out.println(c.cliente.getNome() + " - " + c.cliente.getCpf());
            }
        }
    }
}
