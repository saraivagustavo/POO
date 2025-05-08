public class Main {
    public static void main(String[] args) {
        // Criação de um funcionário
        Funcionario funcionario = new Funcionario();


        // Criação de um gerente
        Gerente gerente = new Gerente();


        // Listar dados do funcionário e do gerente
        funcionario.listarDados();
        gerente.listarDados();

        // Atribuir funcionário ao gerente
        Empresa empresa = new Empresa();
        empresa.contratarFuncionario(funcionario);
        empresa.contratarGerente(gerente);

        empresa.atribuirFuncionarioGerente(gerente.getCpf(), funcionario.getCpf());

        // Listar equipe do gerente
        gerente.listarEquipe();
    }
}
