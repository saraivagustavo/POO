import java.util.Scanner;

public class Pessoa {
    protected String nome, cpf;
    protected Data dtNasc;
    protected char sexo;


    public Pessoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        this.nome = sc.nextLine();

        System.out.print("Digite o CPF: ");
        this.cpf = sc.nextLine();

        System.out.println("Digite a data de nascimento (dd mm aaaa): ");
        this.dtNasc = new Data();

        System.out.print("Digite o sexo (M/F): ");
        this.sexo = sc.next().charAt(0);
    }

    public Pessoa(String nome, String cpf, Data dtNasc, char sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
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