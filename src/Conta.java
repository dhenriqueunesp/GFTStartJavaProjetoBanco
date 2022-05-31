abstract public class Conta {
    protected int agencia, contaNumero;
    protected double saldo;
    protected char tipo;
    protected Cliente cliente;
    private static final int agenciaPadrao = 1;
    private static int sequencial = 1;

    public Conta(Cliente clienteTitular) {
        this.agencia = agenciaPadrao;
        this.contaNumero = sequencial++;
        this.cliente = clienteTitular;
        this.saldo = 0;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.contaNumero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
