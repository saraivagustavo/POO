import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios;
    ArrayList<Gerente> gerentes;

    public Empresa(){
        this.funcionarios = new ArrayList<Funcionario>();
        this.gerentes = new ArrayList<Gerente>();
    }

    public void contratarFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }

    public void contratarGerente(Gerente g){
        this.gerentes.add(g);
    }

    public void folhaPagamento(){
        double soma = 0;
        System.out.println("Folha de pagamento: ");
        for(Funcionario f : this.funcionarios){
            f.listarDados();
            soma += f.getSalario();
        }
        for(Gerente g : this.gerentes){
            g.listarDados();
            soma += g.getSalario();
        }

        System.out.println("GASTOS MENSAIS: R$" + soma);
    }

    private Funcionario localizarFuncionario(String cpf){
        for(Funcionario f : this.funcionarios){
            if(f.getCpf().equals(cpf)){
                return f;
            }
        }
        return null;
    }

    private Gerente localizarGerente(String cpf){
        for(Gerente g : this.gerentes){
            if(g.getCpf().equals(cpf)){
                return g;
            }
        }
        return null;
    }

    public void atribuirFuncionarioGerente(String cpfGerente, String cpfFuncionario){
        Gerente g = this.localizarGerente(cpfGerente);
        Funcionario f = this.localizarFuncionario(cpfFuncionario);

        if(g != null && f != null){
            g.getEquipe().add(f);
            System.out.println("Funcionário " + f.getNome() + " atribuído ao gerente " + g.getNome());
        } else {
            System.out.println("Funcionário ou gerente não encontrado.");
        }
    }

    public Funcionario funcionarioMaisAntigo(){
        Funcionario maisAntigo = this.funcionarios.get(0);
        for(Funcionario f : this.funcionarios){
            if(f.dataAdmissao.comparar(maisAntigo.dataAdmissao) > 0){
                maisAntigo = f;
            }
        }
        for(Gerente g : this.gerentes){
            if(g.dataAdmissao.comparar(maisAntigo.dataAdmissao) > 0){
                maisAntigo = g;
            }
        }
        System.out.println("Funcionário mais antigo: ");
        return maisAntigo;
    }

    public Funcionario funcionarioMaisVelho(){
        Funcionario maisVelho = this.funcionarios.get(0);
        for(Funcionario f : this.funcionarios){
            if(f.dataNascimento.comparar(maisVelho.dataNascimento) > 0){
                maisVelho = f;
            }
        }
        for(Gerente g : this.gerentes){
            if(g.dataNascimento.comparar(maisVelho.dataNascimento) > 0){
                maisVelho = g;
            }
        }
        System.out.println("Funcionário mais velho: ");
        return maisVelho;
    }
}
