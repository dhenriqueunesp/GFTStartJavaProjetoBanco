public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente clienteTitular) {
        super(clienteTitular);
        tipo = 'p';
    }

    public void imprimirExtrato() {
        System.out.println("--- Extrato de Conta Poupanca ---");
        imprimirInfoComum();
    }
}
