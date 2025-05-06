public class BANCO {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        ContaCorrente c1 = new ContaCorrente(g);
        Poupanca p1 = new Poupanca(g);

        c1.extrato();
        p1.extrato();

        c1.sacar(200);
        p1.depositar(50);
        p1.transferir(30, c1);

        c1.extrato();
        p1.extrato();

        c1.alterarLimite();
        c1.extrato();
    }
}