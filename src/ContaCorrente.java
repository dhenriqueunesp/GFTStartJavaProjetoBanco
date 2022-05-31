public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente clienteTitular) {
        super(clienteTitular);
        tipo = 'c';
    }

    public void imprimirExtrato() {
        System.out.println("--- Extrato de Conta Corrente ---");
        imprimirInfoComum();
    }
}