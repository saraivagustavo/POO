public class BANCO {

    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa("Gustavo", "123.456.789-00", new Data(10, 1, 2005), 'M');
        
        Pessoa p2 = new Pessoa("Pedro", "987.654.321-00", new Data(20, 6, 2004), 'M');


        Gerente g = new Gerente("Ana", "111.222.333-44", new Data(17, 1, 1990), 'F', "1234", "senha123");
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, new Data(1, 1, 2020), g);
        c1.depositar(1000);
        c1.sacar(500);
        c1.extrato();

        ContaCorrente c2 = new ContaCorrente("5432-1", p2, new Data(1, 1, 2021), g);
        c2.depositar(500);
        c2.sacar(1000);
        c2.extrato();

        Poupanca p1c1 = new Poupanca("1111-1", p1, new Data(1, 1, 2020), g);
        p1c1.depositar(1000);
        for(int i = 0; i < 5; i++){
            p1c1.rendimentos(5);
        }
        p1c1.extrato();

        Poupanca p2c2 = new Poupanca("2222-2", p2, new Data(1, 1, 2021), g);
        p2c2.depositar(500);
        p2c2.rendimentos(5);
        p2c2.extrato();*/

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
