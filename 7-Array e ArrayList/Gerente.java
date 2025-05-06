import java.util.Scanner;

public class Gerente extends Pessoa {
    private String matricula;
    private String senha;

    public Gerente(){
        super();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a matrícula: ");
        this.setMatricula(sc.nextLine());

        System.out.print("Digite a senha: ");
        this.senha = sc.nextLine();
    }

    public Gerente(String nome, String cpf, Data dtNasc, char sexo, String matricula, String senha){
        super(nome, cpf, dtNasc, sexo);
        this.setMatricula(matricula);
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String atual, String senha) {
        if(atual.equals(this.senha)){
            this.senha = senha;
        } else {
            System.out.println("Senha atual inválida!");
        }
    }


    public boolean validarAcesso(String senha){
        return this.senha.equals(senha);
    }

    public boolean validarAcesso(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        return this.validarAcesso(senha);
    }
}