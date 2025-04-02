public class Gerente extends Pessoa {
    String matricula, senha;

    Gerente(String nome, String cpf, Data dtNasc, char sexo, String matricula, String senha){
        super(nome, cpf, dtNasc, sexo);
        this.matricula = matricula;
        this.senha = senha;
    }

    boolean validarAcesso(String senha){
        return this.senha.equals(senha);
    }
}
