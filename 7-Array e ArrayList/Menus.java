import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

    private Scanner sc = new Scanner(System.in);

    public int exibirMenuPrincipal() {
        System.out.println("\nBem-vindo ao sistema bancário!");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Movimentação Financeira");
        System.out.println("0 - Sair");
        return sc.nextInt();
    }

    public void exibirMenuCadastro(ArrayList<Pessoa> pessoas, ArrayList<Gerente> gerentes, ArrayList<Conta> contas) {
        System.out.println("\nCadastro de pessoas:");
        System.out.println("1) Novo Cliente");
        System.out.println("2) Novo Gerente");
        System.out.println("3) Nova Conta Corrente");
        System.out.println("4) Nova Conta Poupança");
        System.out.println("0 - Voltar");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> pessoas.add(new Pessoa());
            case 2 -> gerentes.add(new Gerente());
            case 3 -> {
                Pessoa tit = escolherPessoa(pessoas);
                Gerente ger = escolherGerente(gerentes);
                contas.add(new ContaCorrente(tit, ger));
            }
            case 4 -> {
                Pessoa tit = escolherPessoa(pessoas);
                Gerente ger = escolherGerente(gerentes);
                contas.add(new Poupanca(tit, ger));
            }
        }
    }

    public void exibirMenuMovimentacao(ArrayList<Pessoa> pessoas, ArrayList<Gerente> gerentes, ArrayList<Conta> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        Conta conta = escolherConta(contas);

        System.out.println("O que deseja realizar?");
        System.out.println("1) Extrato");
        System.out.println("2) Saque");
        System.out.println("3) Depósito");
        System.out.println("4) Transferência");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> conta.extrato();
            case 2 -> conta.sacar();
            case 3 -> conta.depositar();
            case 4 -> {
                System.out.println("Qual a conta destino?");
                Conta destino = escolherConta(contas);
                conta.transferir(destino);
            }
        }
    }

    public static Pessoa escolherPessoa(ArrayList<Pessoa> p) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha o cliente da conta:");
        for (Pessoa tit : p) {
            System.out.println(i + ") " + tit.getCpf() + " - " + tit.getNome());
            i++;
        }
        int index = sc.nextInt();
        return p.get(index - 1);
    }

    public static Gerente escolherGerente(ArrayList<Gerente> g) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha o gerente da conta:");
        for (Gerente ger : g) {
            System.out.println(i + ") " + ger.getCpf() + " - " + ger.getNome());
            i++;
        }
        int index = sc.nextInt();
        return g.get(index - 1);
    }

    public static Conta escolherConta(ArrayList<Conta> c) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha uma conta:");
        for (Conta conta : c) {
            System.out.println(i + ") " + conta.getNumero() + " - " + conta.getTitular().getNome());
            i++;
        }
        int index = sc.nextInt();
        return c.get(index - 1);
    }
}