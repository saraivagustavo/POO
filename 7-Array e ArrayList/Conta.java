import java.util.Scanner;

public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente gerente;

    public Conta(Pessoa t, Gerente g) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        this.setNumero(sc.nextLine());
        this.setTitular(t);
        System.out.print("Digite a data de criação da conta: ");
        this.setCriacao(new Data());
        this.setGerente(g);
        this.setSaldo(0);
    }

    public Conta(Gerente g) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        this.setNumero(sc.nextLine());
        this.setTitular(new Pessoa());
        System.out.print("Digite a data de criação da conta: ");
        this.setCriacao(new Data());
        this.setGerente(g);
        this.setSaldo(0);
    }

    public Conta(String numero, Pessoa titular, Data c, Gerente g) {
        this.setNumero(numero);
        this.setTitular(titular);
        this.setCriacao(c);
        this.setGerente(g);
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
        return this.getSaldo();
    }

    public void extrato() {
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular().getCpf() + " (" + this.getTitular().getNome() + ")");
        System.out.println("Saldo da conta: R$" + this.disponivel() + "\n");
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso na conta " + this.getNumero());
        System.out.println("Novo saldo: R$" + this.disponivel());
    }

    public void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual valor será depositado? ");
        double valor = sc.nextDouble();

        this.depositar(valor);
    }

    public boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " efetuado com sucesso na conta " + this.getNumero());
            System.out.println("Novo saldo: R$" + this.disponivel());
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque!");
            return false;
        }
    }

    public boolean sacar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo disponível para saque: R$" + this.disponivel());
        System.out.println("Qual valor será sacado? ");
        double valor = sc.nextDouble();

        return this.sacar(valor);
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.getNumero() + " efetuada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência!");
            return false;
        }
    }

    public boolean transferir(Conta destino) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saldo disponível para transferência: R$" + this.disponivel());
        System.out.println("Qual valor será transferido? ");
        double valor = sc.nextDouble();

        return this.transferir(valor, destino);
    }
}