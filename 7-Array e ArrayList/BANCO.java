import java.util.ArrayList;

public class BANCO {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();

        var menu = new Menus();
        int opcao = menu.exibirMenuPrincipal();

        while (opcao != 0) {
            if (opcao == 1) {
                menu.exibirMenuCadastro(pessoas, gerentes, contas);
            } else if (opcao == 2) {
                menu.exibirMenuMovimentacao(pessoas, gerentes, contas);
            }
            opcao = menu.exibirMenuPrincipal();
        }

        System.out.println("Encerrando o sistema bancário...");
    }
}