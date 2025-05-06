import java.util.Scanner;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String numero, Pessoa titular, Data c, Gerente g){
        super(numero, titular, c, g);
        this.limite = 200;
        System.out.println("Conta Corrente criada com sucesso!");
    }

    public ContaCorrente(Gerente g){
        super(g);
        this.limite = 200;
        System.out.println("Conta Corrente criada com sucesso!");
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    protected double disponivel() {
        return this.saldo + this.limite;
    }

    public void extrato(){
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
    }

    public void chequeEspecial(double juros){
        if(this.saldo < 0){
            juros = juros / 100;
            this.saldo += this.saldo * juros;
            System.out.println("Saldo negativo, juros aplicados!");
        } else {
            System.out.println("Saldo positivo, sem juros aplicados!");
            System.out.println("Saldo: R$" + this.saldo);
        }
    }


    /*O método alterarLimite() de uma ContaCorrente só deve executar a ação após validar o acesso do gerente, utilizando a senha recebida como parâmetro. O método homônimo que não recebe parâmetros deve fazer a leitura tanto da senha como do novo limite. */
    public void alterarLimite(String senha, double novoLimite){
        if(this.gerente.validarAcesso(senha)){
            this.limite = novoLimite;
            System.out.println("Limite alterado com sucesso!");
            System.out.println("Novo limite: R$" + this.limite);
        } else {
            System.out.println("Senha inválida!");
        }
    }

    public void alterarLimite(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha do gerente: ");
        String senha = sc.nextLine();
        System.out.print("Digite o novo limite: ");
        double novoLimite = sc.nextDouble();
        alterarLimite(senha, novoLimite);
    }

}