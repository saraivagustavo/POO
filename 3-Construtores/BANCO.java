public class BANCO {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gustavo", "123.456.789-00", new Data(10, 1, 2005), 'M');
        
        Pessoa p2 = new Pessoa("Pedro", "987.654.321-00", new Data(20, 6, 2004), 'M');
        
        Data dtHoje = new Data(27, 3, 2025);

        System.out.println("");
        System.out.print("Data de hoje: ");
        dtHoje.imprimir();
        System.out.println("Pessoa 1: " + p1.nome);
        p1.dtNasc.imprimir();
        System.out.println("Pessoa 2: " + p2.nome);
        p2.dtNasc.imprimir();

        System.out.println("Idade das pessoas:");
        System.out.print("Pessoa 1: ");
        p1.idadePessoa(dtHoje);
        System.out.print("Pessoa 2: ");
        p2.idadePessoa(dtHoje);

        Conta c1 = new Conta("1234-5", p1);
        c1.depositar(1000);
        c1.sacar(500);
        c1.extrato();

        Conta c2 = new Conta("5432-1", p2);
        c2.depositar(500);
        c2.sacar(1000);
        c2.extrato();
    }
}
