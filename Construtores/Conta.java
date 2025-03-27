public class Conta {
    String numero;
    Pessoa titular;
    double saldo, limite;

    void extrato(){
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf + " (" + this.titular.nome + ")");
        System.out.println("Saldo da conta: R$" + this.disponivel() + "\n");
    }

    double disponivel() {
        return this.saldo + this.limite;
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso!");
        System.out.println("Novo saldo: R$" + this.saldo);
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor +  " efetuado com sucesso!");
            System.out.println("Novo saldo: R$ " + this.saldo);
            return true;
        } else {
            System.out.println("ERRO: Não foi possível sacar R$" + valor + "!");
            System.out.println("Valor disponível para saque: R$" + this.disponivel());
            return false;
        }
    }

    boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " efetuada com sucesso!");
            System.out.println("Origem: " + this.numero + " - Destino: " + destino.numero);
            return true;
        } else {
            System.out.println("ERRO: Não foi possível transferir R$" + valor + "!");
            System.out.println("Valor disponível para transferência: R$" + this.disponivel());
            return false;
        }
    }

    void chequeEspecial(double juros){
        if(this.saldo < 0){
            juros = juros / 100;
            this.saldo += this.saldo * juros;
            System.out.println("Saldo negativo, juros aplicados!");
        } else {
            System.out.println("Saldo positivo, sem juros aplicados!");
            System.out.println("Saldo: R$" + this.saldo);
        }
    }

    Conta(String numero, Pessoa titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.limite = 200;
        System.out.println("Conta criada com sucesso!");
    }
}
