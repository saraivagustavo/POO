import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario{
    private String senha;
    private ArrayList<Funcionario> equipe;

    // Getters e Setters
    public String getSenha() {
        return senha;
    }
    public ArrayList<Funcionario> getEquipe() {
        return equipe;
    }
    public void setEquipe(ArrayList<Funcionario> equipe) {
        this.equipe = equipe;
    }

    // Construtores
    public Gerente() {
        super();
        this.equipe = new ArrayList<Funcionario>();
    }

    // Métodos
    public void listarDados(){
        System.out.println("Gerente: ");
        super.listarDados();
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

    public void alterarSenha(){
        System.out.println("Confirme a senha atual: ");
        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();
        if(this.validarAcesso(senha)){
            System.out.println("Digite a nova senha: ");
            this.senha = sc.nextLine();
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    public double custoEquipe(){
        double custo = this.getSalario();
        for(Funcionario f : this.equipe){
            custo += f.getSalario();
        }
        return custo;
    }

    public void listarEquipe(){
        this.listarDados();
        System.out.println("Equipe: ");
        for(Funcionario f : this.equipe){
            f.listarDados();
        }
        System.out.println("Custo total da equipe: R$" + this.custoEquipe());
    }

    public void inserirFuncionarioEquipe(Funcionario f){
        this.equipe.add(f);
    }
}
