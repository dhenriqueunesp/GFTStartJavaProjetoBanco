public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Wilson", "12345678910");
        ContaCorrente cc = new ContaCorrente(c);
        ContaPoupanca cp = new ContaPoupanca(c);

        Cliente c2 = new Cliente("Marcos", "10987654321");
        ContaPoupanca cp2 = new ContaPoupanca(c2);
        ContaCorrente cc2 = new ContaCorrente(c2);

        cc2.depositar(300.00);
        cc2.transferir(100, cp2);
        cc2.transferir(100, cc);
        cc.sacar(50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc2.imprimirExtrato();
        cp2.imprimirExtrato();

        Banco b = new Banco("Banco A");
        b.adicionarConta(cc);
        b.adicionarConta(cc2);
        b.adicionarConta(cp);
        b.adicionarConta(cp2);

        b.imprimirLista(b.getListaContas());

        b.imprimirLista(b.getListaContasTipos('c'));
        b.imprimirLista(b.getListaContasTipos('p'));

        b.imprimirClientes();
    }
}