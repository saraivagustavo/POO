import java.util.Scanner;

public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente gerente;

    public Conta(Gerente g) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        this.numero = sc.nextLine();
        System.out.print("Digite os dados do titular: ");
        this.titular = new Pessoa();
        System.out.print("Digite a data de criação da conta: ");
        this.criacao = new Data();
        this.gerente = g;
        this.saldo = 0;
    }

    public Conta(String numero, Pessoa titular, Data c, Gerente g) {
        this.numero = numero;
        this.titular = titular;
        this.criacao = c;
        this.gerente = g;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Pessoa getTitular() {
        return titular;
    }
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Data getCriacao() {
        return criacao;
    }
    public void setCriacao(Data criacao) {
        this.criacao = criacao;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }



    protected double disponivel() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso na conta " + this.numero);
        System.out.println("Novo saldo: R$" + this.saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " efetuado com sucesso na conta " + this.numero);
            System.out.println("Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque!");
            return false;
        }
    }

    public void extrato() {
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf + " (" + this.titular.nome + ")");
        System.out.println("Saldo da conta: R$" + this.disponivel() + "\n");
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.numero + " efetuada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência!");
            return false;
        }
    }
}