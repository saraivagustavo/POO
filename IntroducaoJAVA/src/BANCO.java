public class BANCO {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Gustavo Saraiva";
        p1.idade = 20;
        p1.sexo = 'M';
        p1.cpf = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Pedro Albani";
        p2.idade = 21;
        p2.sexo = 'M';
        p2.cpf = "234.567.890-00";

        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1;
        c1.saldo = 100.0;
        c1.limite = 200.0;

        Conta c2 = new Conta();
        c2.numero = "9246-2";
        c2.titular = p2;
        c2.saldo = 150.0;
        c2.limite = 200.0;

        c1.extrato();
        c2.extrato();

        c1.sacar(150);
        c1.transferir(100, c2);
        c1.sacar(100);
        c1.depositar(100);

        for(int i = 0; i < 5; i++) {
            c1.chequeEspecial(0.5);
            System.out.println("Saldo após " + i + " dias: R$" + c1.saldo + "\n");
        }
    }
}
