import java.util.Scanner;

public class Gerente extends Pessoa {
    String matricula, senha;

    public Gerente(){
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a matrícula: ");
        this.matricula = sc.nextLine();

        System.out.print("Digite a senha: ");
        this.senha = sc.nextLine();
    }

    Gerente(String nome, String cpf, Data dtNasc, char sexo, String matricula, String senha){
        super(nome, cpf, dtNasc, sexo);
        this.matricula = matricula;
        this.senha = senha;
    }

    boolean validarAcesso(String senha){
        return this.senha.equals(senha);
    }

    boolean validarAcesso(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        return this.validarAcesso(senha);
    }
}
