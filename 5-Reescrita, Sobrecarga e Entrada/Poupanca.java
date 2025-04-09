public class Poupanca extends Conta{
    Poupanca(String numero, Pessoa titular, Data c, Gerente g){
        super(numero, titular, c, g);
        System.out.println("Conta Poupança criada com sucesso!");
    }

    Poupanca(Gerente g){
        super(g);
        System.out.println("Conta Poupança criada com sucesso!");
    }

    void extrato(){
        System.out.println("*** EXTRATO DA CONTA POUPANÇA ***");
        super.extrato();
    }

    /*O método rendimentos da classe Poupanca recebe uma taxa de juros como parâmetro e adiciona essa porcentagem ao saldo da poupança. */
    void rendimentos(double taxa){
        taxa = taxa / 100;
        this.saldo += this.saldo * taxa;
        System.out.println("Novo saldo: R$" + this.saldo);
    } 
}
