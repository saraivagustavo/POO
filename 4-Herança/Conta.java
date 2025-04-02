public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente gerente;

    Conta(String numero, Pessoa titular, Data c, Gerente g){
        this.numero = numero;
        this.titular = titular;
        this.criacao = c;
        this.gerente = g;
        this.saldo = 0;
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso!");
        System.out.println("Novo saldo: R$" + this.saldo);
    }
}
