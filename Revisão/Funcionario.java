import java.util.Scanner;

public class Funcionario {
    // Atributos
    protected String nome, cpf;
    protected double salario;
    protected Data dataNascimento, dataAdmissao;

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Construtores
    public Funcionario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.setNome(sc.nextLine());

        System.out.println("Digite o CPF: ");
        this.setCpf(sc.nextLine());

        System.out.println("Digite o salário: ");
        this.setSalario(sc.nextDouble());

        System.out.println("Digite a data de nascimento: ");
        this.dataNascimento = new Data();

        System.out.println("Digite a data de admissão: ");
        this.dataAdmissao = new Data();
    }

    // Métodos
    public void listarDados(){
            System.out.println(this.getNome() + " - " + this.getCpf() + " - R$" + this.getSalario());
        }
}
