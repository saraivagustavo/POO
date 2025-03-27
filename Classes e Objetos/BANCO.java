public class BANCO {

    public static void main(String[] args) {
        Pessoas p1 = new Pessoas();
        p1.nome = "Saraiva";
        p1.idade = 20;
        p1.sexo = 'M';
        p1.cpf = "123.456.789-00";
        
        Pessoas p2 = new Pessoas();
        p2.nome = "Albani";
        p2.idade = 21;
        p2.sexo = 'M';
        p2.cpf = "234.567.890-00";
        
        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1;
        c1.saldo = 20000.0;
        c1.limite = 5000.0;
        
        Conta c2 = new Conta();
        c2.numero = "9246-2";
        c2.titular = p2;
        c2.saldo = 4000.0;
        c2.limite = 6000.0;
        
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + c1.numero);
        System.out.println("Titular: " + c1.titular.cpf + " (" + p1.nome + ")");
        System.out.println("Saldo da conta: R$" + c1.saldo + "\n");
        
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + c2.numero);
        System.out.println("Titular: " + c2.titular.cpf + " (" + p2.nome + ")");
        System.out.println("Saldo da conta: R$" + c2.saldo);
      
    }
}
