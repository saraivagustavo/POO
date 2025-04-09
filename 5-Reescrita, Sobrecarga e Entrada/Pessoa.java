import java.util.Scanner;

public class Pessoa {
    String nome, cpf;
    Data dtNasc;
    char sexo;
    public int idade;


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

    Pessoa(String nome, String cpf, Data dtNasc, char sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
    }

    void idadePessoa(Data dtHoje){
        int idade = dtHoje.ano - this.dtNasc.ano;
        if(dtHoje.mes < this.dtNasc.mes || (dtHoje.mes == this.dtNasc.mes && dtHoje.dia < this.dtNasc.dia)){
            idade--;
        }
        System.out.println("Idade: " + idade);
    }

    
}
