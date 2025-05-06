import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Data dtNasc;
    protected char sexo;


    public Pessoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        this.setNome(sc.nextLine());

        System.out.print("Digite o CPF: ");
        this.setCpf(sc.nextLine());

        System.out.println("Digite a data de nascimento (dd mm aaaa): ");
        this.setDtNasc(new Data());

        System.out.print("Digite o sexo (M/F): ");
        this.setSexo(sc.nextLine().charAt(0));
    }

    public Pessoa(String nome, String cpf, Data dtNasc, char sexo){
        System.out.println("Nova pessoa cadastrada no sistema!");
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDtNasc(dtNasc);
        this.setSexo(sexo);
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
    public Data getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void idadePessoa(Data dtHoje){
        int idade = dtHoje.getAno() - this.dtNasc.getAno();
        if(dtHoje.getMes() < this.dtNasc.getMes() || (dtHoje.getMes() == this.dtNasc.getMes() && dtHoje.getDia() < this.dtNasc.getDia())){
            idade--;
        }
        System.out.println("Idade: " + idade);
    }


}