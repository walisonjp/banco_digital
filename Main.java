public class Main {
    public static void main(String[] args) {
        Cliente walison = new Cliente();
        walison.setNome("Walison");

        Conta cc = new ContaCorrente(walison);
        Conta poupanca = new ContaPoupanca(walison);
        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}